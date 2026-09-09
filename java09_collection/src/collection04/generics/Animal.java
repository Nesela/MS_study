package collection04.generics;

public sealed interface Animal permits Cat, Dog {
    AnimalInfo info();
    void bark();
}
