package class01.basic;

import java.time.LocalDate;

// public class Person (extends Object_ => jav의 모든 class의 최상위 클래스 (조상) = Object
public class Person {

    // member
    // field
    // instance variable
    private String name;
    private int age;

    static int peopleCount = 0;

    // final variable ( = constant)
    final LocalDate birthday;

    // constructor (생성자) => 객체 생성, 필드 초기화
    public Person() {
        this.name = "jae-beom";
        this.age = 0;
        this.birthday = LocalDate.now();
        System.out.println("Person 생성 (기본생성자)");
        peopleCount++;

    }

    /*
    class 안에 constructor를 작성하지 않으면 runtime 시 default constructor를 자동으로 생성
        => 내부적으로 super() 호출만 한다.

        만일, parameter가 있는 constructor를 작성하면, default constructor는 생성되지 않는다 !!
     */

    // 생성자 오버로딩
    public Person(String name, int age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        System.out.printf("Person 생성 (%s, %d, %s)\n", name, age, birthday);
        peopleCount++;

    }
    // method
    // getter , setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = (age >= 0) ? age : 0;
    }

    public String personInfo() {
        return String.format("name : %s \\t age : %d \\t birthday : %3$tY-%3$tm-%3$td", name, age, birthday);
    }
}
