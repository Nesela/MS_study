package class04.polymorphsim;

public class Calculator {
    public int sum(int i) {
        return i + 1;
    }

    public int sum(int i, int j) {
        return i + j;
    }

    public int sum(int i, int j, int k) {
        return i + j + k;
    }

    public double sum(double d, double e) {
        return d + e;
    }
}
