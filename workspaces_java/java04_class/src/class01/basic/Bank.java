package class01.basic;

public class Bank {

    private int money;

    public Bank() {
        System.out.println("계좌 생성");
    }

    public Bank(int money) {
        System.out.println("계좌 생성 (" + money + ")");
        this.money = money;
    }

    public void deposit(int money) {
        this.money += money;
        System.out.println(money + "원 이 입급되었습니다.");
    }

    public String withdrawal(int money) {
        int result = this.money - money;
        return (result > 0) ? money + "원 이 출금되었습니다." : "잔액이 부족합니다.";
    }
}
