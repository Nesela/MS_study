package collection05.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareMain {
    public static void  main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍길동", 100));
        list.add(new Person("김선달", 20));
        list.add(new Person("이순신", 60));

        usingComparable(list);
        usingComparator(list);
    }

    public static void usingComparator(List<Person> list){
        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person other1, Person other2) {
                return other1.getName().equals(other2.getName());
            }
        });
        System.out.println(list);
    }

    public static void  usingComparable(List<Person> list) {
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
