package class00.exam.payment;

public class kakaoPay implements Payment{

    @Override
    public void pay(int amount) {
        System.out.printf("카카오페이 결제 : %d 원 \n", amount);
    }
}
