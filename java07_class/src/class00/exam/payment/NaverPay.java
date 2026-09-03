package class00.exam.payment;

public class NaverPay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.printf("네이버 페이 결제 : %d 원 \n", amount);
    }
}
