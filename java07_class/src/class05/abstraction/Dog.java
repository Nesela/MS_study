package class05.abstraction;

public abstract class Dog extends Animal{

    public void eat(String feed){
        System.out.print("멍멍이가 ");
        super.eat(feed);
    }
}
