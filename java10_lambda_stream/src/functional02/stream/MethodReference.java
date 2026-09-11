package functional02.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MethodReference {
    void main() {
//        staticMethodRef();
//        boundObjRef();
//        unBoundObjRef();
        constructorRef();
    }

    // 4.constructor -> 클래스명::new
    public static void constructorRef() {
        // Supplier를 사용하여, ArrayList 객체를 만들어보자!
        Supplier<List<String>> listFactory = ArrayList::new;

        List<String> list = listFactory.get();
        list.add("constructor");
        list.add("reference");
        IO.println(list);

    }

    // 3. unbound object -> 특정 객체가 아직 존재하지 않지만, 나중에 들어올 " 임의의 객체"(unbound)의 메소드를 사용하겠다.
    // 타입 :: 메소드명
    public static void unBoundObjRef() {
//        Function<String, Integer> getLength = (s) -> s.length();
        Function<String, Integer> getLength = String::length;

        IO.println(getLength.apply("unbound object reference!!"));

        BiFunction<String, String, Integer> compareString = String::compareTo;

        IO.println(compareString.apply("apple","banana"));
    }

    // 2. bound object -> 이미 존재하는 객체::메스드명
    public static void  boundObjRef() {
        String greetings = "Hello, ";

//        UnaryOperator<String> sayHello = (s)-> greetings + s;
        UnaryOperator<String> sayHello = greetings::concat;

        IO.println(sayHello.apply("jaebeom"));
        IO.println(sayHello.apply("hemeets"));
    }

    // 1. static method -> 클래스명::메소드명
    public static void staticMethodRef() {
//        Function<String, Integer> parser = (s) -> Integer.parseInt(s);
        Function<String, Integer> parser = Integer::parseInt;

        IO.println(parser.apply("100") + 50);

//        Consumer<String> printer = (s) -> IO.println(s);
        Consumer<String> printer = IO::println;

        printer.accept("method reference!!");
    }
}
