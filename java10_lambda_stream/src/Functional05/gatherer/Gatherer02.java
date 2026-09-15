package Functional05.gatherer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Gatherer;

public class Gatherer02 {

    void main(){
//        creating();
//        batching();
        sliding();
    }

    // sliding window
    public static void  sliding() {
        Gatherer<Integer, ArrayDeque<Integer>, List<Integer>> sliding =
                Gatherer.ofSequential(
                        ArrayDeque::new,
                        (state, element, downstream)->{
                            state.addLast(element);
                            if (state.size() == 2) {
                                downstream.push(List.copyOf(state));
                                state.removeFirst();
                            }
                            return  true;
                        }
                        // finisher 안하면!
                );
        List.of(1, 2,3 ,4)
                .stream()
                .gather(sliding)
                .forEach(IO::println);
    }

    public static void batching() {
        List.of(1, 2,3 ,4 ,5 ,6 ,7)
                .stream()
                .filter(n -> n %2 ==1)
                .gather(
                Gatherer.ofSequential(
                        ArrayList::new,
                        (state, element, downstream)-> {
                            state.add(element);
                            if (state.size() == 2){
                                downstream.push(List.copyOf(state));
                                state.clear();
                            }
                            return true;
                        },
                        (state, downstream)-> {
                            if (!state.isEmpty()){
                                downstream.push(List.copyOf(state));
                            }
                        }
                )
                )
                .forEach(IO::println);
    }

    // batch gatherer ( fixed window gatherer)
    public static void creating() {
        //
        Gatherer<Integer, List<Integer>, List<Integer>> batchOf3 =
                //static <T,A,R> GathererPREVIEW<T,A,R> ofSequential(Supplier<A> initializer,Gatherer.IntegratorPREVIEW<A,T,R> integrator,
                // BiConsumer<A,Gatherer.DownstreamPREVIEW<? super R>> finisher)
                Gatherer.ofSequential(
                        // initializer
                        ArrayList::new,
                        // integrator
                        (state, element, downstream) -> {
                            state.add(element);
                            if (state.size() == 3) {
                                downstream.push(List.copyOf(state));
                                state.clear();
                            }
                            return true;
                        },
                        // finisher
                        (state, downstream) -> {
                            if (!state.isEmpty()){
                                downstream.push(List.copyOf(state));
                            }
                        }
                );
        List.of(1, 2, 3, 4, 5,6 ,7)
                .stream()
                .gather(batchOf3)
                .forEach(IO::println);
        /*
        1
        2
        3
        [1, 2, 3]
        4
        5
        6
        [4, 5, 6]
        7
        [7]
        ->
         */
    }
}
