package statements02.loop;

public class Loop02_while {
    void main() {
//        while01();
//        while02();
        while03();
        while04();
    }

    public static void while04() {
        int i = 0;
        while (i > -1) {
            IO.println(i);
            i++;
        }
    }

    public static void while03() {
        int i = 10;

        while (i < 10) {
            IO.println(i);
        }

        do {
            IO.println(i);
        } while (i < 10);
    }

    public static void while02() {
        int i = 1;

        do {
            IO.println(i);
            i++;
        } while(i == 10);
    }

    public static void while01() {
        int i = 1;

        while (i < 10) {
            IO.println(i);
            i++;
        }

        IO.println("while 이 종료된 후 i : " + i);
    }
}
