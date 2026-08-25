package method01.basic;

public class MethodMain {
    public static void main(String[] args){
        Method.publicMethod();
        Method.protectedMethod();
        Method.defaultMethod();
        // Method.privateMethod(); private 메서드는 같은 클래스 내부에서만 불러오기가 가능하다

        Method m = new Method();
        m.nonStaticMethod();
    }
}
