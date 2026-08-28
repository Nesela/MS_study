package statements03.block;

public class CodeBlock {
    void main() {
        blockScope();
        block01(5, 3);
        block02();
    }

    public static void block02() {
        int i = 0;
        outer : {
            IO.println("블록 시작");

            while (true){
                IO.println(i++);

                if (i == 10){
                    // while 종료
//                    break ;

                    // outer block 이 종료된다
                    break outer;
                }
            }

//            IO.println("블록 끝");
        }

        IO.println("outer 블록 바깥");
    }

    public static void block01(int i, int j) {
        {
            int result = i + j;
            IO.println("i + j = " + result);
        }

        {
            int result = i - j;
            IO.println("i - j = " + result);
        }
        // labeled block
        mul:
        {
            int result = i * j;
            IO.println("i * j = " + result);
        }
    }

    public static void blockScope() {
        {
            int i = 10;

            IO.println();
        }

//        IO.println(i);
    }
}
