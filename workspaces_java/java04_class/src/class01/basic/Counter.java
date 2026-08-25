package class01.basic;

public class Counter {

    private int count;

    public void add() {
        // this.count
        count++;
    }
    public void sub(){
        count--;
    }

    public void prn(){
        System.out.println("count : " + count);
    }
}
