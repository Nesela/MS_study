package class03.polymorphism;

public class AnimalMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.bark();
        dog.bark();

        // ---

        Animal animal = null;
        String select = IO.readln("1: Dog\n2: Cat\t숫자 입력 :");

        animal = switch ((Integer.parseInt(select))) {
            case 1 -> new Dog();
            case 2 -> new Cat();
            default -> new Animal();
        };

        animal.bark();
    }
}
