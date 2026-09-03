package class09.sealed;

// sealed : 상속 제한
// permits : 해당되는 자식 class 만 상속받을 수 있음
public abstract sealed class Animal permits Carnivore, Herbivore {
    abstract void eat();

}
