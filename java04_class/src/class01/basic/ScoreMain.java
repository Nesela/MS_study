package class01.basic;

public class ScoreMain {
    public static void main(String[] args){
        Score no = new Score();
        no.prn();

        Score hong = new Score("hong-gd");
        hong.prn();

        Score lee = new Score("lee", 100, 100, 100);
        lee.prn();
    }
}
