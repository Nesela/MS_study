package method02.other;

//다른 패키지에 위치한 method를 불러오는법
import method01.basic.Method;

public class MethodMain {
    public static void main(String[] args){
        Method.publicMethod();
        // Method.protectedMethod(); [protected 같은 패키지 + 다른 패키지라도 '상속'받은 자식 클래스에서는 불러올 수 있음!]
    }

    /*

    static
    - class.method

    (non-static)
    - class variable = new class();
    variable.method();
     */

    public void nonStaticMethod() {
        System.out.println("non static method");
    }
}
