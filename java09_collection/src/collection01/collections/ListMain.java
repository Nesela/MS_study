package collection01.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args){
        //List : index
        //list01();
        //list02();
        //list03();
        //list04();
        //list05();
        list06();
    }

    public static void list06() {
        /*
        ArrayList : 데이터 조회 강력
        LinkedList : 데이터 수시로 추가/삭제 강력
         */

        // queue : First In First Out
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.addFirst(4);
        queue.addLast(5);
        System.out.println(queue);
        // 4, 1 ,2 ,3, 5

        int first = queue.pollFirst();
        System.out.println(queue);
        System.out.println(first);

        System.out.println(queue.getFirst());
        System.out.println(queue);

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.size());
    }

    public static void list05() {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("김선달");
        list.add("이순신");
        list.add("강호동");
        list.add("유재석");
        list.add("조세호");
        list.add("신동엽");

        // ConcurrentModificationException
        // 이순신 삭제하고 싶어.
        /*
        for (String name : list) {
            if(name.equals("이순신")) {
                list.remove("이순신");
            }
        }
        System.out.println(list);
         */

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals("이순신")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

    public static void list04() {
        var list = new ArrayList<String>();
        list.add("홍길동");
        list.add("김선달");
        list.add("이순신");

        System.out.println(list);
        System.out.println(list.contains("이순신"));

        list.remove("김선달");
        System.out.println(list);
        System.out.println(list.size());

        list.set(1,"김선달");
        System.out.println(list);
    }

    public static void list03() {
        var list = new ArrayList<String>();
        list.add("홍길동");
        list.add("김선달");
        list.add("이순신");
        list.add("강호동");
        list.add("유재석");
        list.add("조세호");
        list.add("신동엽");

        for (int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----");

        for (var e : list){
            System.out.println(e);
        }
        System.out.println("----");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    public static void list02() {
        // List.of -> ImmutableCollections
        List<Integer> binary = List.of(0, 1);
        System.out.println(binary);
        //UnsupportedOperationException
        //binary.add(2);
    }

    public static void list01() {
        // < > : generics
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("김선달");
        list.add("이순신");
        list.add("강호동");
        list.add("유재석");
        list.add("조세호");
        list.add("신동엽");

        System.out.println(list);

        list.remove("조세호");
        System.out.println(list);
    }
}
