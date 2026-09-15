package functional03.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPipeline02 {
    void main() {
//        flatMapping();
//        collecting();
//        searchingAndCounting();
        parallelProcessing();
    }

    public static void parallelProcessing() {
        long limit = 100_000_000l;

        // sequential
        long start = System.currentTimeMillis();
        long sumSequential = LongStream.rangeClosed(1, limit).sum();
        long end = System.currentTimeMillis();
        IO.println(sumSequential);
        IO.println((end - start) + "ms");

        // parallel
        start = System.currentTimeMillis();
        long sumParallel = LongStream.rangeClosed(1, limit).parallel().sum();
        end = System.currentTimeMillis();
        IO.println(sumSequential);
        IO.println((end - start) + "ms");
    }

    public static void searchingAndCounting() {
        List<String> fruits = List.of("apple", "banana", "mango", "avocado", "cherry", "grange");

        // anyMatch
        boolean hasA = fruits.stream().anyMatch(s -> s.contains("a"));
                IO.println(hasA);

        // allMatch
        boolean allA = fruits.stream().allMatch(s -> s.contains("a"));
        IO.println(allA);

        // noneMatch
        boolean noneZ = fruits.stream().noneMatch(s -> s.contains("z"));
        IO.println(noneZ);

        // count
        long countStartA = fruits.stream()
                .filter((s)->s.startsWith("a"))
                .count();
                IO.println("a 로 시작하는 과일의 갯수 : " + countStartA);
    }

    public static void collecting() {
        List<Student> students = List.of(
                new Student("홍길동", "서울", 100),
                new Student("김선달", "부산", 90),
                new Student("이순신", "인천", 95),
                new Student("조세호", "수원", 70),
                new Student("이동헌", "수원", 60)
        );

        // 스트림의 결과물을 하나의 String 객체로 합쳐서 담고 싶을 때
        String names = students.stream()
                .map(Student::name)
                // public static Collector<CharSequence, ?, String> joining<CharSequence delimiter, CharSequence prefix, CharSequence suffix)
                .collect(Collectors.joining(",", "[", "]"));
        IO.println(names);

        // Collectors.groupingBy()를 사용하여 도시별로 데이터를 묶어 Map<String, List<Student>>로 그룹화
        Map<String, List<Student>> byCity = students.stream()
                .collect(Collectors.groupingBy(Student::city));
        IO.println(byCity);

        // Collectors.groupingBy()와 다운스트림(Collectors.averagingInt)을 함께 사용하여 도시별 그룹화 후 점수 평균을 계산
        Map<String, Double> cityScoreAvg = students.stream()
                // <R,A> R collect(Collector<? super T, A, R> collector)
                .collect(
                        Collectors.groupingBy(
                                Student::city, Collectors.averagingInt(Student::score)
                        )
                );
        IO.println();

        // partitioningBy() 괄호 안에는 결과가 true나 false(불리언 값)로 나오는 조건식
        Map<Boolean, List<Student>> passOrFail = students.stream()
                .collect(Collectors.partitioningBy((s) -> s.score() >= 80));

        IO.println(passOrFail.get(true));
        IO.println(passOrFail);


    }

    public static void flatMapping() {
        List<Classroom> school = List.of(
                new Classroom("BackEnd", List.of(new Student("홍길동", "서울", 100), new Student("김선달", "부산", 90))),
                new Classroom("FrontEnd", List.of(new Student("이순신", "인천", 88)))
        );

        // school 객체 안에 있는, 이름만 출력하고 싶다.
        List<String> allStudentNames = school.stream()
                .flatMap(clazz -> clazz.students().stream())
                .map(Student::name)
                .toList();
        IO.println(allStudentNames);

        // score가 90보다 큰 학생의 이름 뒤에 ★을 붙이고 출력하고 싶다.
        school.stream()
                .flatMap(cls -> cls.students().stream())
                .mapMulti((student, consumer) -> {
                    if (student.score() >= 90) {
                        consumer.accept(student.name() + "★");
                    }
                })
                .forEach(IO::println);
    }
}
