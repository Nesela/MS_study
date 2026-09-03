package class00.exam.shape;

public class Rectangle extends Polygon{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
