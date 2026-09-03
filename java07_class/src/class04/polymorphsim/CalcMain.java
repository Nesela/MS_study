package class04.polymorphsim;

public class CalcMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1));
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(4, 5, 6));
        System.out.println(calc.sum(7.8, 9.01));

    }
}
