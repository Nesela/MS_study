package class06.interfaces;

// 기본적으로 모든 method는 abstract method 임을 가정
//  변수 => 상수
// public
public interface Animal {

    // public static final (=constant)
    String country = "Zootopia";

    // abstract method : 자식 class 가 반드시 구현!
    void bark();

    // default method : 상속받는 자식 class들의 공통 기능을 미리 구현
    default void sleep() {
//        System.out.println("zzz");
        printSound("zzz");
    }

    // static method : 객체 없이 사용하기 위한 기능
    static void eat() {
        System.out.println("냠냠");
    }

    // private method : default / static method 에서 사용할 공통 로직
    private static void printSound(String sound) {
        System.out.println(sound);
    }

}
