package statements02.loop;

public class Loop01_for {
    void main() {
//        for01();
//        for02();
//        for03();
//        for04();
        for05();
    }

    public static void for05() {
        int j = 0;
        for (int i = 0; i < 10; i++) {
            for (; j < 10; j++) {
                IO.println("i : " + i + " j : " + j);
            }
        }

    }

    public static void for04() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                IO.println("i : " + i + " j : " + j);
            }
            IO.println();
        }
    }

    public static void for03() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // continue 현재 반복의 다음 명령어는 건너뛰고, 다음반복으로 진행해라
                continue;
            }
            IO.println(i);
        }

    }

    public static void for02() {
        for (int i = 100; i >= 1; i--) {
            if (i % 10 == 0) {
                IO.println();
            }
            IO.print(String.format("%3d", i));
        }
    }

    public static void for01() {
        // for ( 초기값 ; 조건 ; 증감 ) { 명령; }
        for (int i = 0; i < 10; i++) {
            IO.println(i);
        }
    }
}
