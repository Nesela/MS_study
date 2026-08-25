package method01.basic;

public class Method {
    /*
    접근제한자 (접근제어자)
    - public
    - protected
    - (default)
    - private
     */
    //기호들은 일방적으로 사용할때 간략하게 표기되는 기호 (참고)
    // 어디서나 접근, 참조 가능 (+)
    public static void publicMethod() {
        System.out.println("public method");
    }

    //같은 패키지 내에서 opr 상속받은 클래스 내에ㅐ서 (#)
    protected static void protectedMethod(){
        System.out.println("protected method");
    }

    //같은 패키지 내에서 (~)
    static void defaultMethod() {
        System.out.println("default method");
    }

    // 현재 클래스 내에서만 (-)
    private static void privateMethod() {
        System.out.println("private method");
    }

    public static void main(String[] args){
        // static method -> class.method
        Method.publicMethod();
        Method.protectedMethod();

        // 같은 클래스 안에서 호출할 때는 class. 를 생략 가능하다
        defaultMethod();
        privateMethod();
    }

    public void nonStaticMethod() {
        System.out.println("non static method");
    }
}
