package class00.exam.payment;

public class PaymentMain {
    public static void main(String[] args) {
        Payment[] payments = {
                new kakaoPay(),
                new NaverPay(),
        };

        for (int i = 0 ; i < payments.length ; i++) {
            payments[i].pay(10000);
        }
    }
}
