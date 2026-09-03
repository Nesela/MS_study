package class00.exam.cafe;

public class Americano extends Coffee{
    @Override
    public String makeCoffeeType() {
        System.out.println("3. 원액의 물을 추가한다.");
        return "아메리카노";
    }
}
