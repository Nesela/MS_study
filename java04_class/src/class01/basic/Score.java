package class01.basic;

public class Score {

    private String name;
    private int kor;
    private int eng;
    private int math;

    private int sum;
    private double avg;

    public Score() {
//        this.name = "noname";
//        this.kor = 0;
//        this.eng = 0;
//        this.math = 0;
//        this.sum = this.getSum();
//        this.avg = this.getAvg();

        System.out.println("Score(name)");
        this("noname", 0, 0, 0);

    }

    public Score(String name) {
//        this.name = name;
//        kor = 10;
//        eng = 10;
//        math = 10;
//        this.sum = this.getSum();
//        this.avg = this.getAvg();
        System.out.println("Score(name)");
        this("nmae", 10, 10, 10);
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        System.out.println("Score(name, kor, eng, math)");
        this.sum = this.getSum();
        this.avg = this.getAvg();
    }

    public int getSum() {
        return this.kor + this.eng + this.math;
    }

    public double getAvg() {
        return this.sum / 3.0;
    }

    public void prn(){
        System.out.printf("""
                [%s] kor : %d \t eng : %d \t math : %d \t sum : %d \t avg : %.2f
                """, this.name, this.kor, this.eng, this.math, this.sum, this.avg);
    }

}
