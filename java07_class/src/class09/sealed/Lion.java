package class09.sealed;

public final class Lion extends Carnivore {
    public void eat() {
        System.out.print("사자가 ");
        super.eat();
    }
}
