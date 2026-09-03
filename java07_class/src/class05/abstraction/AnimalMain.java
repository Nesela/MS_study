package class05.abstraction;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();
            //abstract class 는 instantiation 불가!
        // Animal animal = new Animal();

        Cat cat = new Cat();
        cat.bark();
        cat.eat("참치");

        JindoDog dog = new JindoDog();
        dog.bark();
        dog.eat("프리미엄 사료");
    }
}
