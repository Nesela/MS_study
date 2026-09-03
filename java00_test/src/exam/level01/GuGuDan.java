package exam.level01;


import java.util.Scanner;

//gugudan 출력
public class GuGuDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 값을 입력해주세요");
        int num1 = sc.nextInt();

        System.out.println("B 값을 입력해주세요");
        int num2 = sc.nextInt();

        int i = num1 * num2;
        System.out.printf("값은 : %d 입니다",i);

    }
}

