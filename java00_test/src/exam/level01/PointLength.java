package exam.level01;

import java.util.Scanner;

/*
두 좌표 (x, y) 를 입력받아 (0, 0) 부터 (x, y) 까지의 길이를
소수점 둘째짜리 까지 출력하자.
 */
public class PointLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x 좌표 : ");
        int x = sc.nextInt();
        System.out.println("y 좌표 : ");
        int y = sc.nextInt();

        double length = pLength(x, y);
        System.out.printf("%.2f \n", length);

    }

    public static double pLength(int x, int y) {
        double res = Math.hypot(x, y);

        // java.lang.Math class 참조
        // a^2 + b^2 = c^2 (피타고라스 정리)

        return res;
    }
}
