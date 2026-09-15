package Functional4.optinal;

import java.util.Optional;

public class Optional01 {
    void main() {
//        creating();
//        consuming();
//        transforming();
        unWrapping();

    }

    public static void unWrapping() {
        Optional<String> emptyOpt = Optional.empty();

        // orEls
        String value01 = emptyOpt.orElse("default");
        IO.println(value01);

        // orElseGet
        String value02 = emptyOpt.orElseGet(()-> "default (supplier)");
        IO.println();

        // or ElseThrow
        String value03 = emptyOpt.orElseThrow(() -> new IllegalArgumentException("null"));
        IO.println(value03);
    }

    public static void transforming() {
        Optional<String> opt= Optional.of("Hello, World!");

        // <U> Optional<U> map(Function<? super T, ? extends U> mapper)
        Optional<String> result = opt.map(String::trim)
                // Optional<T> filter<Predicate<? super T> predicate)
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase);

        result.ifPresent(IO::println);
    }

    public static void consuming() {
        String nullableValue = (Math.random() > 0.5) ? "Data exists" : null;
        Optional<String> opt = Optional.ofNullable(nullableValue);

        // ifPresent
        opt.ifPresent(s -> IO.println(s));

        // ifPresentOrElse
        opt.ifPresentOrElse(
                (s)-> IO.println(),
                () -> IO.println("null")
        );
    }

    public static void creating() {
        Optional<String> opt01 = Optional.of("hello, World!");
        IO.println(opt01);

        String nullableValue = (Math.random() > 0.5) ? "Data exists" : null;
        Optional<String> opt02 = Optional.ofNullable(nullableValue);
        IO.println(opt02);

        Optional<String> opt03 = Optional.empty();
        IO.println(opt03);
    }
}
