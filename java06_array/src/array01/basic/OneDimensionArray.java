package array01.basic;

import java.util.Arrays;

public class OneDimensionArray {
    public static void main(String[] args) {
        array01();
        array02();
        array03();
        array04();
    }

    public static void  array04() {
        Person[] people = new Person[3];

        people[0] = new Person("hong-gd", 100);
        people[1] = new Person("kim-sd", 50);
        people[2] = new Person("lee-ss", 60);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void array03() {
        int[] num = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));

        num = new int[] {1, 3, 2, 7 ,9 ,8 ,10 ,5, 4, 6};
        System.out.println(Arrays.binarySearch(num, 13));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void array02() {
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 향상된 for : enhanced for (foreach > stream)
        // for ( 변수 : 객체)
        for (int i : num) {
            System.out.printf("%2d", i);
        }

        System.out.println();
    }

    public static void array01() {
        //array : 같은 type의 여러 개의 값을 효과적으로 관리하기 위한 객체
        int[] num;
        // 초기화 시 입력한 크기가 고정 !
        num = new int[5];
        // index (0부터 시작)
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        System.out.println(num);

        System.out.printf("[ ");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%2d", num[i]);
        }
        System.out.println(" ]");

        //ArrayIndexOutOfBoundsException
//        num[5] = 6;
    }
}
