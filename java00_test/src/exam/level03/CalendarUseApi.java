package exam.level03;

import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarUseApi {

    public static void main(String[] args ) {
        CalendarUseApi cal = new CalendarUseApi();
        cal.prn(2026, 9);
    }

    public void prn(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);

        System.out.printf("%n\t\t%d년 %d월%n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        LocalDate firstDay = yearMonth.atDay(1);

        // 해당 월 1일의 요일
        int startDay = firstDay.getDayOfWeek().getValue() % 7;

        // 1일 앞의 빈 칸
        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }

        // 해당 월의 모든 날짜 출력
        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
            System.out.printf("%d\t", day);

            // 토요일이면 줄바꿈
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }
}
