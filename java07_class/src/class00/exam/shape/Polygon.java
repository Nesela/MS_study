package class00.exam.shape;

public abstract class Polygon implements Shape {
    protected int numberOfSide;

    public Polygon(int numberOfSide) {
        this.numberOfSide = numberOfSide;
    }

    public int getNumberOfSide() {
        return this.numberOfSide;
    }
}
