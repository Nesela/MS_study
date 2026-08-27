package statements01.condition;

import java.util.Scanner;

public class Condition01_if {
    public static void main(String[] args) {

        int i = 10;
        int j = 3;

        if01(i, j);
        System.out.println(if02(i, j));
        if03(i, j);
        System.out.println(if04(i, j));
        System.out.println(if05(i, j));
        if06(i, j);
        if07(i, j);

        test();
    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int input = sc.nextInt();

        //입력받은 숫자가 2와 3의 공배수 이면 "2와 3의 공배수" 출력 / 아니라면 "공배수 아님" 출력

        if (input % 2 == 0 && input % 3 == 0 ){
            System.out.println("2와 3의 공배수");
        } else {
            System.out.println("공배수 아님");
        }

        sc.close();
    }

    public static void if01(int i, int j) {
        // if (조건) => 해당 조건이 참(true) = > block 안에 있는 명령을 수행해라.
        if (i > j) {
            System.out.println("i가 j보다 크다");
        }
    }

    public static void if07(int i, int j) {
        if (i >= j) {
            if (i == j) {
                System.out.println("i 가 j 와 같다.");
            } else {
                System.out.println("i 가 j 보다 크다.");
            }
        } else {
            System.out.println("i 가 j 보다 작다.");
        }
    }

    public static void if06(int i, int j) {
        if (i > j) {
            System.out.println("i가 j 보다 크다");
        }

        if (i < j) {
            System.out.println("i가 j 보다 작다");
        }

        if (i == j) {
            System.out.println("i 가 j 와 같다");
        }
    }

    public static String if05(int i, int j) {

        if (i == j) {
            System.out.println("첫번째 if");
            return "i가 j와 같다";
        } else if (i < j) {
            System.out.println("두번째 if");
            return "i 가 j 보다 작다.";
        } else if (i > j) {
            System.out.println("세번째 if");
            return "i 가 j보다 크다.";
        }
        return "";
    }

    public static String if04(int i, int j) {
        String result = null;

        if (i == j) {
            System.out.println("첫번째 if");
            result = " i가 j 와 같다.";
        } else if (i > j) {
            System.out.println("두번째 if");
            result = "i가 j보다 크다.";
        } else {
            System.out.println("세번째 if");
            result = "i가 j 보다 작다.";
        }

        return result;
    }

    public static void if03(int i, int j) {

        if (i == j) {
            System.out.println("첫번째 if");
            System.out.println("i 가 j 와 같다.");
        } else if (i < j) {
            System.out.println("두번째 if");
            System.out.println("i 가 j보다 작다");
        } else if (i > j) {
            System.out.println("세번째 if");
            System.out.println("i 가 j 보다 크다");

        }
    }

    public static String if02(int i, int j) {
        String result = null;

        if (i < j) {
            System.out.println("첫번째 if");
            result = "i 가 j 보다 작다.";
        } else {
            System.out.println("첫번째 if의 조건이 거짓!");
            result = "i 가 j 보다 크거나 같다.";
        }

        return result;
    }
}
