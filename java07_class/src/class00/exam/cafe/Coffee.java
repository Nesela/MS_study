package class00.exam.cafe;

public abstract class Coffee {

    public final void makeCoffee() {
        System.out.println("1. 컵을 준비한다.");

        System.out.println("2. 커피 원액을 내린다.");

        String menu = makeCoffeeType();

        System.out.printf("4. %s를 손님에게 전달한다. \n", menu);
    }

    public abstract String makeCoffeeType();
}
