package Functional05.gatherer;

import java.util.List;
import java.util.stream.Gatherers;

public class Gatherer04 {
    void main() {
//        useWindowFixed();
//        useWindowSliding();
        foldVsScan();
    }

    public static void foldVsScan() {
        List.of(1, 2, 3, 4)
                .stream()
                .gather(Gatherers.fold(() -> 0, (acc, element) -> acc + element))
                .forEach(IO::println);
        IO.println("-----");
        List.of(1, 2, 3, 4)
                .stream()
                .gather(Gatherers.scan(() -> 0, (acc, element) -> acc + element))
                .forEach(IO::println);
    }

    public static void useWindowSliding() {
        List.of(1, 2, 3, 4, 5)
                .stream()
                .gather(Gatherers.windowSliding(2))
                .forEach(IO::println);
    }

    public static void useWindowFixed() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8)
                .stream()
                .gather(Gatherers.windowFixed(3))
                .forEach(IO::println);
    }
}
