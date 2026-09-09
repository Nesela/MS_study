package collection04.generics;

// T : Type
public class House02<T> {
    private T animal;

    public void enter(T animal) {
        this.animal = animal;
    }
    public T getAnimal() {
        return animal;
    }
}
