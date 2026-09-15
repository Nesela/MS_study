package Functional05.gatherer;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class Gatherer03 {
    void main() {
        parallel();
    }

    public static void parallel() {
        Gatherer<Integer, int[], Integer> parallelSum =
//        static <T,A,R> Gatherer<T,A,R> of(Supplier<A> initializer,
//                Gatherer.Integrator<A,T,R> integrator,
//                BinaryOperator<A> combiner,
//                BiConsumer<A, Gatherer.Downstream<? super R>> finisher)
                Gatherer.of(
                        // initializer
                        () -> new int[1],
                        //integrator
                        (state, element, downstream) -> {
                            state[0] += element;
                            downstream.push(state[0]);
                            return true;
                        },
                        // combiner : 병렬로 인해 각각 만들어진 state를 합쳐
                        (leftState, rightState) -> {
                            leftState[0] += rightState[0];
                            return leftState;
                        },
                        //finisher
                        (state, downstream) -> {
                        }
                );
        Stream.of(1, 2, 3,4 ,5,6, 7 ,8)
                .parallel()
                .gather(parallelSum)
                .forEach(IO::println);
    }
}
