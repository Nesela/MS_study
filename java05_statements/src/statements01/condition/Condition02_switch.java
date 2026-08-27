package statements01.condition;

public class Condition02_switch {
    public static void main(String[] args) {
        // switch : 선택
        switch01();
        switch02();
        switch03();
        switch04();

        System.out.println(switch05(5));
        System.out.println(switch06(6));

        switch07();

        test01();
        test02();
    }

    public static void test02() {
        // switch를 사용하여..
        // country 가 kor 이면 "대한민국" / eng 이면 "USA" / jpn 이면 "japan" 출력하자.
        enum Country {kor, eng, jpn}

        Country country = Country.kor;
        String reult = switch (country) {
            case kor -> "대한민국";
            case eng -> "USA";
            case jpn -> "japan";
        };
        System.out.println(reult);
    }


    public static void test01() {
        // switch를 사용하여
        // month 의 숫자가 3,4,5 이면 "봄" / 6,7,8 이면 "여름" / 9,10,11 이면 "가을" / 12,1,2 이면 "겨울" 출력하자.
        int month = 2;

        switch (month) {
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("1 ~ 12 숫자를 입력해주세요");
        }
    }

    public static void switch07() {
        enum Day {SuNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

        Day day = Day.THURSDAY;
        String result = switch (day) {
            case SuNDAY -> "sunday";
            case MONDAY -> "monday";
            case TUESDAY -> "thursday";
            case WEDNESDAY -> "wednesday";
            case THURSDAY -> "thursday";
            case FRIDAY -> "friday";
            case SATURDAY -> "saturday";
        };

        System.out.println(result);
    }

    public static String switch06(int day) {
        // yield : block 안에서 expression 리턴
        // yield로 반환하는 값은 모든 case 가 반드시 같은 타입
        return switch (day) {
            case 0, 6: {
                boolean isHoliday = true;
                String info = (day == 0) ? "sunday" : "seturday";
                yield info + (isHoliday ? "(Holday)" : "");
            }
            case 1, 2, 3, 4, 5: {
                boolean isHoliday = false;
                String info = switch (day) {
                    case 1 -> "monday";
                    case 2 -> "tuesday";
                    case 3 -> "wednesday";
                    case 4 -> "thursday";
                    case 5 -> "friday";
                    default -> "invalid day";
                };
                yield info + (isHoliday ? "holiday" : "");
            }
            default: {
                yield "invalid day";
            }
        };
    }

    public static String switch05(int day) {
        // case return (switch가 statements가 아닌 expression이 됨 => 반드시 모든 case, default 필요)
        // case 마다 실행할 식 (expression) 바로 연결 (lambda expression)
        return switch (day) {
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
    }

    public static void switch04() {
        int i = 3;

        switch (i) {
            case 1, 3:
                System.out.println("홀수입니다.");
                break;
            case 2, 4:
                System.out.println("짝수입니다.");
                break;
            default:
                System.out.println("1 ~ 4 사이의 값만 넣어주세요.");
        }
    }

    public static void switch03() {
        int i = 3;

        switch (i) {
            case 1:
            case 3:
                System.out.println("홀수입니다.");
                break;
            case 2:
            case 4:
                System.out.println("짝수입니다.");
                break;
            default:
                System.out.println("1 ~ 4 사이의 숫자만 넣어주세요");
        }
    }

    public static void switch02() {
        int i = 3;
        // break : 가장 가까운 반복/switch 종료
        switch (i) {
            case 1:
                System.out.println("1 입니다");
                break;
            case 2:
                System.out.println("2 입니다");
                break;
            case 3:
                System.out.println("3 입니다");
                break;
            case 4:
                System.out.println("4 입니다");
                break;
            case 5:
                System.out.println("5 입니다");
                break;
        }
    }

    public static void switch01() {
        int i = 3;
        // switch (식 or 값)
        // fall through : break가 없으면 다음 case로 계속 진행
        switch (i) {
            case 1:
                System.out.println("1 입니다.");
            case 2:
                System.out.println("2 입니다.");
            case 3:
                System.out.println("3 입니다.");
            case 4:
                System.out.println("4 입니다.");
            case 5:
                System.out.println("5 입니다.");
        }
    }

}