package class00.exam.shape;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
/*        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4);
        Shape rectangle = new Rectangle(10, 13);

        System.out.println("원의 넓이 : " + circle.getArea());
        System.out.println(((Polygon)triangle).getNumberOfSide() + "각형의 넓이 : " + triangle.getArea());
        System.out.println(((Polygon)rectangle).getNumberOfSide() + "각형의 넓이 : " + rectangle.getArea());

 */

        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 4);
        Shape rectangle = new Rectangle(10, 13);

        Scanner sc = new Scanner(System.in);
        System.out.println("도형을 골라주세요 \n 1: 원 \n 2: 삼각형 \n 3: 사각형");

        Shape shape = null;

        int select = sc.nextInt();
        switch (select) {
            case 1:
                shape = new Circle(5);
                System.out.println("원의 넓이 : " + circle.getArea());


                break;
            case 2:
                shape = new Triangle(3, 4);
                System.out.println(((Polygon)triangle).getNumberOfSide() + "각형의 넓이 : " + triangle.getArea());
                break;
            case 3:
                shape = new Rectangle(10, 13);
                System.out.println(((Polygon)rectangle).getNumberOfSide() + "각형의 넓이 : " + rectangle.getArea());
                break;
            default:
                return;
        }

        shape.getArea();
    }
}
