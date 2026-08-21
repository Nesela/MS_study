package type.reference;

public class Type03_Person {
    public static void main(String[] args){
        // 참조타입 변수 - new 참조타입();
        // new => constructor 호출

        Person jaebeom = new Person();

        System.out.println(jaebeom);
        System.out.println(jaebeom.name);
        System.out.println(jaebeom.age);
    }
}
