package collection04.generics;

public class AnimalMain {
    public static void main(String[] args) {
//        house01();
//        house02();
        house03();
    }

    public static void house03(){
        // <T extends Animal> : Animal 상속/구현 T (반드시)
        House03<Cat> catHouse = new House03<>();

        catHouse.enter(new Cat(new AnimalInfo("꽁이", 12), false));
        Cat cat = catHouse.getAnimal();
        cat.bark();

//        House03<String> stringHouse = new House03<>();

    }

    public static void house02() {
        // <Cat> : Cat Type만 가능
        House02<Cat> catHouse  = new House02<>();

        catHouse.enter(new Cat(
                new AnimalInfo("길고양이", 3),
                true
        ));

        System.out.println(catHouse.getAnimal().getClass().getSimpleName());

        // compile 단계에서 Type Checking
//        catHouse.enter(new Dog(AnimalInfo("바둑이",10)), 10));

        House02<String> stringHouse = new House02<>();
        stringHouse.enter("?????");
        String s = stringHouse.getAnimal();
        // ....?
    }

    public static void  house01() {
        House01 house = new House01();

        house.enter(new Cat(
                new AnimalInfo("꽁아", 12), false
        ));

        //generics 를 사용하지 않는 경우 -> type에 유연함!
        Object animal = house.getAnimal();

        if (animal instanceof Dog dog) {
            dog.bark();
        } else if (animal instanceof Cat cat) {
            cat.bark();
        }

        // generics 를 사용하지 않는 경우 -> 꺼내오는 객체의 타입을 알 수가 없다!
        // warning! ClassCastException
        ((Cat)animal).bark();

        house.enter("?????");
        house.enter(1234);
    }
}
