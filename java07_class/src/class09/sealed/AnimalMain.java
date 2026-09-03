package class09.sealed;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal01 = new Tiger();
        Animal animal02 = new Lion();
        Animal animal03 = new Rabbit();
        Animal animal04 = new Herbivore();

        sealedTypeSwitch(animal01);
        sealedTypeSwitch(animal02);
        sealedTypeSwitch(animal03);
        sealedTypeSwitch(animal04);
    }

    // pattern matching : type 맞게 변수 binding
    public static void sealedTypeSwitch(Animal animal) {
        switch (animal) {
            case Carnivore carnivore -> carnivore.eat();
            case Herbivore herbivore -> herbivore.eat();
        }
    }
}
