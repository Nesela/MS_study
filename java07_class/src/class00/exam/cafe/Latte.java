package class00.exam.cafe;

public class Latte extends Coffee{
    @Override
    public String makeCoffeeType() {
        System.out.println("3. 원액에 우유를 추가한다.");
        return "라떼";
    }
}
