package class09.sealed;

public class Rabbit extends Herbivore{

    public void eat(){
        System.out.print("토끼가 ");
        super.eat();
    }
}
