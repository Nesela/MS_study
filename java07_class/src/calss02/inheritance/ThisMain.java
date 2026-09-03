package calss02.inheritance;

public class ThisMain {
    public static void main(String[] args) {
        This01 this01 = new This01();

        // upcasting (지식 객체 => 부모 타입)
        Super super01 = this01;

        Super super02 = new This02();
        // downcasting (부모 객체 -> 자식 타입)
        This02 this02 = (This02) super02;

        // ClassCastException
        This01 this03 = (This01) super02;

        /*
        compile 시에는 error가 나지 않았던 이유
        - java는 정적 타입체크(static type checking) : compiler 는 변수의 선언된 타입만 가지고 타입 검사 (= 문법적으로 맞는지만 확인)
        runtime 신에는 error가 났던 이유
        - jvm(실행 ) 시 instance의 type이 casting 하려는 type과 다르기 때문에 ClassCastException 발생

        [type checking]
        static type : compile 시 type을 검사하고 변수 type을 미리 정의
        dynamic type : runtime 시 type을 검사하고 변수 type은 값에 다라 결정됨 ( 타입 추론)

        [type conversing]
        strong type : type에 대해 엄격함 (서로 다른 type끼리는 암시적 변환이 거의 없다)
        weak type : type에 대해 느슨함 (암시적 type 변환이 자주 발생)

         */
    }
}
