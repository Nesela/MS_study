package class01.basic;

public class CarMain {
    public static void main(String[] args){
        Car genesis = new Car("genesis gv80", 90_000_000);
        genesis.prn();

        //type 변수 = new 생성자();
        Car hummer = new Car("hummer ev", 250_000_000);
        hummer.prn();
    }
}
