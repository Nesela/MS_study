package Functional05.gatherer;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class Gatherer01 {
    void main() {
        //java.util.stream.Getherer : 사용자 정의 중간연산
//        creating();
        intermediating();
    }

    public static void intermediating() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .gather(Gatherer.ofSequential(
                        () -> new int[1],
                        (state, element, downstream) -> {
                            state[0] += element * 2;
                            downstream.push(state[0]);
                            return true;
                        }
                ))
                .forEach(IO::println);
        // 지금 위의 코드를, .map으로 바꿔서 동일한 결과 출력
//        numbers.stream()
//                .map(n -> state[0] += n * 2)
//                .forEach(IO::println);
    }

    public static void creating() {
        // Integer -> int[] 누적 -> Integer
        Gatherer<Integer, int[], Integer> mySum =
                // static <T, A, R> Gatherer<T, A, R> ofSequential(Supplier<a> initializer, Gatherer.Intergerator(A, T, R> integrator)
                Gatherer.ofSequential(() -> new int[1],
                        // boolean integrate(A state, T element, Gatherer,Downstream<? super R> downstream
                        (state, element, downstream) -> {
                            // state : 현재 누적 상태
                            // element : 현재 입력 요소
                            state[0] += element;
                            // downstream :  다음 단계로 값 전달하는 객체
                            downstream.push(state[0]);
                            // return true : 입력 요소 처리 계속 / false : 입력 요소 처리 종료
                            return true;
                        });
        Stream.of(1, 2, 3, 4, 5)
                .gather(mySum)
                .forEach(IO::println);

    }
    /*
    Gatherer<T, A,R>
        T : input type
        A : state type (누적상태)
        R : output type
     */
}
