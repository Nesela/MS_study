package class07.interfaces;

// class 는 단일 상속 / interface 는 다중 구현
public class Griffin extends Lion implements Eagle, Fantasy{

    @Override
    public void fly() {
        System.out.println("그리핀이 파닥파닥");
    }

    @Override
    public void born() {
        System.out.println("그리핀이 삐약삐약 하고 태어났어");
    }

    public void bark(){
        System.out.println("끼룩끼룩 끼요요요요요욕?");
    }
}
