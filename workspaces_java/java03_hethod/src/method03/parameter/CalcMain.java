package method03.parameter;

public class CalcMain {
    public static void main(String[] args){
        System.out.println("sum(10) 의 결과 : " + Calculator.sum(10));

        System.out.println(Calculator.sum(2.2));
        Calculator.sum(10, 20);
        System.out.println(Calculator.sum(3, 4, 5));


        //1 번
        int i = Calculator.sub(3, 2);
        System.out.println(i);

        //2 번
        Calculator cal = new Calculator();
        cal.mul(3.2, 4.5);

        //3 번
        System.out.println(Calculator.div(10, 5));

        /* 교수님 문제
        Calculator class 안에다 작성할 것!
        1. sub 이라는 메소드
         - 파라미터로 int type 2개 받음
         - 리턴타입 int
         - 첫 번째로 받은 값에서 두번째로 받은 값을 빼기 연산 하고, 해당 값을 리턴
         - static

         2. mul 이라는 메소드
         - 파라미터로 double type 2개 받음
         - 리턴 타입 void
         - 첫 번째로 받은 값과 두 번째로 받은 값을 곱하기 연산 하고, 해당 값을 출력
         - (non-static)

         3. div 이라는 메소드
         - 파라미터로 int type 2개 받음
         - 리턴 타입 String
         - 첫 번째로 받은 값을 두 번째로 받은 값으로 나눈
            "몫 : ?? /n 나머지 : ?? " 로 리턴
         - static
         */
    }
}
