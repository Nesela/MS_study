package method01;

public class MethodTestMain {
    public static void main(String[] args){

        // 1. input의 값이 짝수인지 홀수인지 판별해보자
        int input = 10;
        System.out.println("입력한 값 " + input + "은(는) 짝수이다 : " + MethodTest_박재범.isEven(input) );

        // 2. 다음과 같이 출력하자.
        MethodTest_박재범 test = new MethodTest_박재범();
        test.prn("박재범");
        test.prn(30);
        test.prn(78.12345);
        /*
        안녕하세요, 제 이름은 박재범 입니다. (println 사용)
        제 나이는 30 살 입니다. (printf 사용)
        저는 78.12 % 만큼 이해했습니다. (printf 사용)
        (3개의 prn을 overLoding 해라)
         */

        // 3. 입력한 문자열을 대문자로 바꿔서 리턴하자.
        String result = MethodTest_박재범.stringToupperCase("lowercase");
        System.out.println(result);

        // 4. 삼항연산자를 사용하여, 천 번째 수가 더 크면 첫번째 수/ 아니면 두번째 수 출력
        test.compare(10, 12);
    }
}
