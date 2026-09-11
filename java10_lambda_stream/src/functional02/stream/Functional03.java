package functional02.stream;

import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Functional03 {
    void main() {
//        func01();
        func02();
    }

    public static void func02() {
        // ??? Function 을 이용하여, String "10" 과 String "20" 을 입력하면 -> 숫자 30을 리턴하여 출력하자.
        BiFunction<String, String, Integer> sum = (s01, s02) -> Integer.parseInt(s01) + Integer.parseInt(s02);

        IO.println(sum.apply("10", "20"));
    }

    public static void func01() {
        // IntFunction을 사용하여, 숫자(n)를 입력했을때 10 보다 작으면 "0n" 문자열을, 10보다 크거나 같으면 "n" 문자열을 리턴
        IntFunction<String> time = n -> (n < 10) ? "0" + n : String.valueOf(n);

        IO.println(time.apply(1));
        IO.println(time.apply(6));
        IO.println(time.apply(11));
    }
}
