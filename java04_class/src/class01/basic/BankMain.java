package class01.basic;

public class BankMain {
    public static void main(String[] args) {
        // class 변수 = new 생성자();
        Bank kb = new Bank();
        kb.deposit(10000);

        Bank ibk = new Bank(20000);
        System.out.println(ibk.withdrawal(30000));
    }
}
