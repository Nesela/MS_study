package exam.level03;

public class CalendarHardCoding {

    // 윤년 계산
    private static boolean isLeapYear(int year) {


        return false;
    }

    // 해당 월의 최고 일수 계산 (28, 29, 30, 31)
    private static int getDates(int year, int month) {


        return 0;
    }

    // 해당 월의 1일의 요일 계산
    private static int whatDay(int year, int month) {
        int dayOfWeek = 0;

        // 1년 1월 1일 ~ year년 month월 1일까지의 총 합


        // 1년 1월 1일 ~ year-1년 12월 31일까지의 합


        // year년 1월 1일 ~ year년 month-1월 마지막일 까지의 합


        // year년 month월 1일


        // 1년 1월 1일 ~ year년 month월 1일의 합 % 7 = 요일
        // 0: 일요일 / 1: 월요일 / 2: 화요일 / 3: 수요일 ... / 6: 토요일


        return dayOfWeek;
    }

    // 출력
    public static void prn(int year, int month) {
        // 윗부분
        System.out.printf("\t\t%d년 %d월\n", year, month);
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

        // 시작 요일

        // 해당 요일만큼 빈 공간

        // 출력
    }

    public static void main(String[] args) {
        prn(2026, 9);
    }
}
