package class01.basic;

public class Car {

    private String model;
    private int price;

    // parameter가 있는 controller를 작성 => default constructor가 만들어지지 않는다 !
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void prn() {
        System.out.printf("%S 의 가격은 %d 원 입니다.\n", model, price);
    }
}
