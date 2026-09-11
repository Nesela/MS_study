package functional03.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamPipeline01 {
    void main() {
//        creating();
//        intermediating();
        reducing();
    }
    public static void reducing() {
        List<Integer> prices = List.of(1500, 3200, 800, 5000);

        int total = prices.stream()
                .reduce(0, (a, b) -> a+ b);
        IO.println("총 합 : " + total);

        prices.stream()
                .reduce(Integer::max)
                .ifPresent(max -> IO.println("최고가 : " + max));

        int count = prices.stream()
                .map((_) -> 1)
                .reduce(0, Integer::sum);
        IO.println("갯수 : " + count);
    }

    public static void intermediating() {
        var fruits = List.of("apple", "banana", "orange", "cherry", "mango", " melon", "avocado");

        // stream
        fruits.stream()
                // Stream<t> filter<Predicate<? super T> predicate) : 조건 true인 data (element) 만
                // "apple", "avocado"
                .filter((s)->s.startsWith("a"))
                // <R> Stream<R> map(Function<? super T, ? extends R> mapper) : data 하나하나에 실행/적용
                // "APPLE", "AVOCADO"
                .map(String::toUpperCase)
                // Stream<T> peek(Consumer<? super T> action) : 로그, 디버깅
                // "APPLE", "AVOCADO" (console에 "log" 라고 출력)
                .peek((_)->IO.println("log"))
                // "AVOCADO", "APPLE"
                // Stream<T> sorted(Comparator<? super T> comparator) : 정렬
                .sorted(Comparator.reverseOrder())
                // Stream<T> distinct() : 중복제거
                // "AVOCADO", "APPLE"
                .distinct()
                // Stream<T> limit<long maxSize) : 최대겟수 제한
                // "AVOCADO"
                .limit(1)
                // ----
                // void forEach(Consumer<? super T> action) :
                .forEach(IO::println);

    }

    public static void creating() {
        // static <T> Stream<T> of(T... values)
        // void forEach(Consumer<? super T> action)

        // 정적 팩토리 메서드 : 고정된 데이터셋
        Stream<String> stream01 = Stream.of("gong-gd", "kim-sd", "lee-ss");
        stream01.forEach(IO::println);

        // 비어있는 스트림 : null 대신에  // NullPointerException 방지
        Stream<String> stream02 = Stream.empty();
        stream02.forEach(IO::println);

        // 무한 스트림 : 조건이 없으면 무한!
        Stream<Integer> stream03 = Stream.iterate(1, n -> n < 10, n -> n +1);
        stream03.forEach(IO::println);

        // primitive stream : 특정 기본타입 전용 스트림(메모리 효율적)
        IntStream stream04 = IntStream.of(1, 2, 3, 4, 5);
        stream04.forEach(IO::println);

        // builder pattern : 로직에 따라 동적으로 요소를 추가하고 싶을 때!
        Stream.Builder<String> builder = Stream.builder();
        builder.add("1 ").add("2 ");
        if (Math.random() > 0.5) {
            builder.add("3 ");
        }

        Stream<String> stream05 = builder.build();
        stream05.forEach(IO::println);
    }
}
