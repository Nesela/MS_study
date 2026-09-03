package class05.abstraction;

// abstract class : 추상 클래스, abstract method 를 가질 수 있는 class -> instance 생성 불가
public abstract class Animal {


    // abstract method : 추상 메소드, 상속받는 자식 클래스가 반드시 override 해서 구현!
    public abstract void bark();

    public void eat(String feed) {
        System.out.println(feed + "먹는다.");
    }
}
