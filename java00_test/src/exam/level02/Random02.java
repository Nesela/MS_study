package exam.level02;

import java.util.Scanner;

public class Random02 {
    public static void test01() {
        // 숫자 a와 숫자 b를 입력받아
        // 두 숫자 사이의 랜덤한 수 하나를 출력하자.
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 A 입력");
        int a = sc.nextInt();
        System.out.println("숫자 B 입력");
        int b = sc.nextInt();

        int BigN = Math.max(a, b);
        int SmallN = Math.min(a, b);

        int rand = (int) (Math.random() * ((BigN - SmallN) + 1)) + SmallN;
        System.out.println(rand);

    }

    public static void test02() {
        /*
         0~9 사이의 랜덤한 숫자를 만들어
         ■ □ □ □ ■
         □ ■ □ ■ □
         □ □ ■ □ □
         □ ■ □ ■ □
         ■ □ □ □ ■
         형태(5 * 5) 로 출력하자.
         X에 위치한(■) 숫자들의 평균을 구하자.
         */

        double result = 0;

        for(int i =0; i<5;i++){
            int left = 0+i;
            int right = 4-i;
            for(int j =0; j<5;j++){
                int randomValue = (int)(Math.random() * 10);
                System.out.print(randomValue + " ");
                if(j == left || j == right)
                    result += randomValue;
            }
            System.out.println();
        }

        System.out.printf("평균값 : %.2f", result / 9);
    }

    public static void main(String[] args) {
        test01();
        test02();
    }
}