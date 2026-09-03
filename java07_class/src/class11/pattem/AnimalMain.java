package class11.pattem;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog(new AnimalInfo("멍멍이", 3), 10000);
        Animal cat = new Cat(new AnimalInfo("냐옹이", 4), true);
        Object str = "고양이/멍멍이 아니야.";
        /*
        Pattern Matching
        - instanceof : casting 생략
        - switch : sealed 를 사용하여 default 생략
        - record : record 객체의 data를 deconstruction (구조 분해)
         */

        usingInstanceOf(dog);
        usingInstanceOf(cat);
        usingInstanceOf(str);

        usingSwitchPattern(dog);
        usingSwitchPattern(cat);

        usingRecordDeconstruction(dog);
        usingRecordDeconstruction(cat);
    }

    public static void usingRecordDeconstruction(Animal animal){
        switch (animal) {
            case Dog(AnimalInfo(String name, int age), int walkingCount) ->
                    System.out.println("이름 : " + name + " \t 나이 : " + age + "움직임횟수 :" + walkingCount);
            case Cat(AnimalInfo(String name, int age), boolean isSleep) ->
                    System.out.println("이름 : " + name + " \t 나이 : " + age + "움직임횟수 :" + isSleep);
        }
    }

    public static void usingSwitchPattern(Animal animal){
        switch (animal) {
            case Dog dog -> System.out.println("멍멍이 진료중 : " + dog.info().name());
            case Cat cat -> System.out.println("냐옹이 진료중 : " + cat.info().name());
            default -> throw new IllegalStateException("Unexpected value: " + animal);
        }
    }

    public static void usingInstanceOf(Object obj) {
        if (obj instanceof Animal animal) {
            System.out.println(animal);
        } else {
            System.out.println("고양이 / 멍멍이 아니야....");
        }
    }
}
