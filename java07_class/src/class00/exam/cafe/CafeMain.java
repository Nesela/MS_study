package class00.exam.cafe;

public class CafeMain {
    public static void  main(String[] args) {
        Coffee[] orders = {
                new Americano(),
                new Americano(),
                new Americano(),
                new Latte(),
                new Latte(),
                new Americano(),
        };

        for (Coffee coffee : orders) {
            coffee.makeCoffee();
        }
    }
}
