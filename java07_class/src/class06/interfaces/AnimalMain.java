package class06.interfaces;

public class AnimalMain {
    public static void main(String[] args){
        Animal dog = new Dog();

        dog.bark();
        dog.sleep();
        Animal.eat();
        System.out.println(Animal.country);
    }
}
