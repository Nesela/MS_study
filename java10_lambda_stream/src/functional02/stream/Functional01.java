package functional02.stream;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class Functional01 {
    void main() {
//        unary();
//        binary01();
        binary02();
    }

    public static void binary02() {
        // IntBinaryOperator
        IntBinaryOperator sum = (i, j) -> i + j;
        IO.println(sum.applyAsInt(10, 3));
    }

    public static void binary01() {
        // BinaryOperator
        BinaryOperator<Integer> sum = (i, j) -> i + j;
//        IO.println(sum.apply(3, 4));

        // default <V> BiFunction<T,U,V> adnThen(Function<? super R, ? extends V> after)
        // apply -> ane Then ( function )
        IO.println(sum.andThen((n) -> n * 2).apply(10 , 3));

    }

    public static void unary() {
        /* UnaryOperator

        @FunctionalInterface
        public interface UnaryOperator<T> extends Function<T,T>
         */

        UnaryOperator<String> hello = (name) -> "Hello, " + name;
        IO.println(hello.apply("Jaebeom"));
    }
}
