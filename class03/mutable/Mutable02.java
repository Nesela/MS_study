package class03.mutable;

public class Mutable02 {
    public static void main(String[] args) {

        Human hong = new Human("hong-gd", 100);
        System.out.println(hong.getName());
        System.out.println(System.identityHashCode(hong));

        hong.setName("홍길동");
        System.out.println(hong.getName());
        System.out.println(System.identityHashCode(hong));

    }
}
