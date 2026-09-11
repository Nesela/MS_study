package functional02.stream;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Functional02 {
    void main() {
//        predict01();
//        predict02();
        predict03();
    }

    public static void predict03() {
        // BiPredicate
        BiPredicate<Integer, String> bp = (i, s) -> i - Integer.parseInt(s) > 0;

        int i = Integer.parseInt(IO.readln("i 입력 : "));
        String s = IO.readln("s 입력 : ");

        IO.println(bp.test(i, s));
    }

    public static void predict02() {
        // Predicate<Integer> -> IntPredicate
        IntPredicate conditionTwo = n -> n % 2 == 0;
        IntPredicate conditionThree = n -> n % 3 == 0;


        int input = Integer.parseInt(IO.readln("숫자를 입력해 주세요 : "));
        if (conditionTwo.test(input)) {
            IO.println(input + " 은(는) 2의 배수 입니다.");
        }

        if(conditionThree.test(input)) {
            IO.println(input + " 은(는_ 3의 배수 입니다.");
        }

        // 2와 3의 공배수
        if (conditionTwo.and(conditionThree).test(input)) {
            IO.println("2와 3의 공배수입니다!!!");
        }

        if (conditionTwo.negate().test(input)) {
            IO.println(input + " 은(는) 홀수입니다!!");
        }
    }

    public static boolean isNull(String name, Predicate<String> predict) {
        return predict.test(name);
    }

    public static void predict01(){
        // Predicate
        String name;

        while (true) {
            name = IO.readln("이름 읿력 : ");

            if (isNull(name, (input) -> input.trim().length() == 0)) {
                IO.println("다시 입력해 주세요...");
            } else {
                break;
            }
        }
        IO.println("제 이름은 " + name + " 입니다 !");
    }
}
