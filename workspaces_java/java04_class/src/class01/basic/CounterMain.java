package class01.basic;

public class CounterMain {
    public static void main(String[] args){
        Counter cnt01 = new Counter();
        cnt01.prn();

        cnt01.add();
        cnt01.add();
        cnt01.add();

        cnt01.prn();

        cnt01.sub();
        cnt01.prn();

        System.out.println("----------");
        Counter cnt02 = new Counter();
        cnt02.add();
        cnt02.prn();
    }
}
