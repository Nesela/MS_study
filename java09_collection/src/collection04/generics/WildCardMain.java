package collection04.generics;

public class WildCardMain {
    public static void main(String[] args) {
//        wildCard();

//        extendsWildCard();
        superWildCard();

        /*
            ? extends : producer (read 에 적합)
            ? super : consumer ((write 에 적합)
         */
    }
    public static void superWildCard() {
        House02<Animal> animalHouse = new House02<>();
        check03(animalHouse);
    }
    // Animal || Animal의 상위 타입
    public static void check03(House02<? super Animal> house) {
        house.enter(new Dog(new AnimalInfo("바우와우", 10), 10));
    }

    public static void extendsWildCard() {
        House02<Dog> dogHouse = new House02<>();
        dogHouse.enter(new Dog(new AnimalInfo("바우와우", 10), 10));
        check02(dogHouse);
    }
    // 어떤 타입이 올지는 모르겠어. 그런데 Animal 을  상속/구현 타입이라는건 알고 있어.
    public static void check02(House02<? extends  Animal>house) {
        Animal animal = house.getAnimal();
        System.out.println(animal.info());
    }

    public static void wildCard() {
        House02<Cat> catHouse = new House02<>();
        catHouse.enter(new Cat(new AnimalInfo("길고양이",5), false));

        check01(catHouse);
    }

    // <?> : wildcard = 어떤 타입이 올지는 모르겠어.
    public static void check01(House02<?> house) {
        // 그래서 Object로 꺼내올꺼야.
        Object animal = house.getAnimal();

        System.out.println(animal.getClass().getSimpleName());
    }
}
