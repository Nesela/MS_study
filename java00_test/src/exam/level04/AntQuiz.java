package exam.level04;

import java.util.Scanner;

/*
베르나르 베르베르 "개미" 에서 나온 개미수열
    1				-- 1
    11				-- 1이 한개
    12				-- 1이 두개
    1121			-- 1이 한개 2가 한개
    122111			-- 1이 두개 2가 한개 1이 한개
    112213			-- 1이 한개 2가 두개 1이 세개
    12221131		-- 1이 두개 2가 두개 1이 한개 3이 한개
    새로운 숫자가 나오기 전까지만 읽어나간다.
 */
public class AntQuiz {
    public static void antPrn(int stage) {

    }

    public static void main(String[] args) {
        System.out.println("input stage : ");
        Scanner sc = new Scanner(System.in);
        antPrn(sc.nextInt());
    }
}