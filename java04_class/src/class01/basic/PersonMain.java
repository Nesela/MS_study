package class01.basic;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args){
        // class 변수 = new constructor(); => instanec 참조 (변수가)
        Person beom = new Person();
        System.out.println(beom);

        System.out.println(beom.getName());
        System.out.println(beom.getAge());

        // parameter 있는 생성자 호출
        Person park = new Person("park-ss", 100, LocalDate.of(1997, 10, 26));
        System.out.println(park.getName());
        System.out.println(park.getAge());

        System.out.println(beom.personInfo());
        System.out.println(park.personInfo());

        beom.setAge(50);
        System.out.println(beom.personInfo());

        System.out.println(Person.peopleCount);
    }
}
