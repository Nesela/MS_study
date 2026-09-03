package exam.level02;

import java.util.Scanner;

/*
naver에서 윤년 검색

연수가 4로 나누어지는 해는 윤년으로 둡니다.
연수가 100으로 나누어지면 평년으로 합니다.
연수가 100으로 나누어지더라도 400으로 나누어지면 다시 윤년으로 합니다.
 */
public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;


        return isLeap;
    }

    public static void main(String[] args) {
        System.out.println("연도 입력 : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " 년은 윤년이 맞습니다.");
        } else {
            System.out.println(year + " 년은 윤년이 아닙니다.");
        }

    }
}