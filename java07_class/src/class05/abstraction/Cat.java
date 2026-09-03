package class05.abstraction;

public class Cat extends Animal {

    public void bark() {
        System.out.println("야옹");
    }

    public void eat(String feed) {
        System.out.print("고양이가 ");
        super.eat(feed);
    }
}
