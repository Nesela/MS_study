package method03.parameter;

public class Calculator {
    /*
    접근제한자 메모리 리턴타입 메소드명 (파라미터) {}
    - parameter : 메소드 외부에서 ㅈ전달되는 값을 받아, 메소드 내부에서 사용하기 위한 지역"변수"
    - arguments " 메소드 외부에서 전달되는 "값"
     */

    public static int sum(int i){
        int result = i + 1;

        return result;
    }

    //method overLoading : parameter의 갯수 or parameter의 type이 달라야 한다!
    public static double sum(double d) {
        return d + 1.1;
    }

    public static void sum(int i, int j){
        System.out.println(i + j);
    }

    public static int sum(int i, int j, int k){
        return i + j + k;
    }
    // 1번
    public static int sub(int i, int j){
        int result = i - j;
        return result;
    }
    // 2번
    public void mul(double c, double d){
        double result = c * d;
        System.out.println(result);
    }
    // 3번
    public static String div(int i, int j){
        int as = i / j;
        int df = i % j;

//        return "몫 : " + as + " / 나머지 : " + df;
        // String.format
        String result = String.format("몫 : %d \n 나머지 : %d", as, df);
        return result;
    }
}


