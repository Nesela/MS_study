package collection01.collections;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        // Set : value 중복값 허용 x null값은 1개만 허용
        //set01();
        //set02();
        //set03();
        //set04();
        set05();
    }

    public static void set05() {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.addAll(List.of(80, 95, 50, 70, 65));

        // 오름차순
        System.out.println(scores);

        // 1. 특정 점수 근처의 값 찾기
        // 70점보다 낮은
        System.out.println(scores.lower(70));
        // 70점보다 높거나 같은
        System.out.println(scores.ceiling(70));
        // 90점 바로 위의 점수
        System.out.println(scores.higher(90));

        // 2. 가장 높은 점수 / 가장 낮은 점수
        System.out.println(scores.last());
        System.out.println(scores.first());

        // 3. 내림차순 정렬
        // public class TreeSet(E) extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
        NavigableSet<Integer> descending = scores.descendingSet();
        System.out.println(descending);

        // 4. 범위 검색해서 새로운 set으로
        // 60 <= subSet(search) <= 80
        System.out.println(scores.subSet(60, true, 80, true));
    }

    public static void set04() {
        Set<String> hasSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] names = new String[] {"홍길동", "이순신", "김선달"};

        for (String name : names) {
            hasSet.add(name);
            linkedSet.add(name);
            treeSet.add(name);
        }

        System.out.printf("""
                HasSet (순서 X) : %s
                LinkedHashSet (순서 O) : %s
                TreeSet (정렬 O ) : %s
                """, hasSet, linkedSet, treeSet);
    }

    public static void set03() {
        var set = Set.of(3, 2, 1, 5, 4);
        System.out.println(set);
        // collection.of -> collection factory 로 만들어지는 instance => hash algorithm
    }

    public static void set02() {
        Set<Integer> octal = Set.of(0, 1, 2, 3, 4, 5, 6, 7);
        // octal.add(8);
    }

    public static void set01() {
        Set<String> set = new HashSet<>();

        set.add("홍길동");
        set.add("이순신");
        set.add("김선달");
        set.add("김선달");
        // HashSet : Hash Table로 관리하고 있음 ( 사실은 HashMap 객체)
        System.out.println(set);

        // 김선달 삭제
        if (set.contains("김선달")) {
            set.remove("김선달");
        }
        System.out.println(set);

        set.remove("조세호");
        System.out.println(set);
    }
}
