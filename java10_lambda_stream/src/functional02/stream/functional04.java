package functional02.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class functional04 {
    void main() {
        // Supplier
        Supplier<Integer> randomNum = () -> (int)(Math.random() * 45) + 1;
        IO.println(randomNum.get());
        IO.println(randomNum.get());
        IO.println(randomNum.get());
        IO.println(randomNum.get());
        IO.println(randomNum.get());
        IO.println(randomNum.get());
        IO.println(randomNum.get());

        // Consumer
        Consumer<String> hello = (name) -> IO.println("Hello, " + name);
        hello.accept("dongHeon");
        hello.accept("윤마치");

        // BiConsumer : void accept(T, t, U u)
        BiConsumer<String, Integer> student = (name, score) -> IO.println("이름 : " + name + "\t 점수 : " + score);
        student.accept("홍길동", 100);
        student.accept("김선달", 20);
        student.accept("이순신", 50);

        // unnamed variable : (_) lambda 에서 정의는 해야 하지만, 실제로 사용은 안할 때
        BiConsumer<String, Integer> logger = (_, i) -> IO.println(i + "번 째 오류");
        logger.accept("a", 1);
        logger.accept("b", 2);
        logger.accept("c", 3);
        logger.accept(null, 4);
    }
}
