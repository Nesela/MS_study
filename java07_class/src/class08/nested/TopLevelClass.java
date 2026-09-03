package class08.nested;

// top level class : className 이 file의 이름 (TopLevelClass.java file -> public / default
public class TopLevelClass {

    // nested class : class 혹은 interface 내부에 선언된 class

    // static nested class : 외부 클래스의 인스턴스가 없어도 생성 가능 (_ static member class)
    static class StaticClass {
        public static void prn() {
            System.out.println("static class");
        }
    }

    // inner class : top level class 의 내부에 있는 non-static class ( = instance member class, local class, anonymous class)
    class InnerClass {
        public static void prn() {
            System.out.println("inner class");
        }
    }

    // local class : method 내부에 선언
    public static void localClass() {
        class LocalClass {
            public static void prn() {
                System.out.println("local class");
            }
        }
        LocalClass.prn();
    }

    // anonymous class : 이름이 없는 class (interface 를 일회성으로구현하고 싶을 때 사용)
    Runnable anonymous = new Runnable() {
        @Override
        public void run() {
            System.out.println("anonymous class");
        }
    };
}
