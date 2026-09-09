package collection04.generics;

// <T extends Animal> : 애니멀을 상속/구현 받은 T타입 (반드시)
public class House03 <T extends Animal>{
    private T animal;

    public void enter(T animal) {
        this.animal = animal;
    }
    public T getAnimal() {
        return animal;
    }
}

