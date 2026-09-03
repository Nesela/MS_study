package class00.exam.shape;

public class Triangle extends Polygon {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height / 2.0);
    }
}
