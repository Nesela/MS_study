package class01.inheritance;


import java.time.LocalDate;

// public class Person extends Object = Object 라는 class ( root class) 를 상속받은 Person class야!
public class Person {

    // member
    private String name;
    private int age;

    public static int peopleCount = 0;

    final LocalDate birthDay;

    // constructor
    public Person() {
        // super();
        this.name =  "hong-gd";
        this.age = 0;
        this.birthDay = LocalDate.now();
        peopleCount++;
        System.out.println("Person() 생성");
    }

    // overload
    public Person(String name, int age, LocalDate birthDay) {
        this.name =  "hong-gd";
        this.age = 0;
        this.birthDay = LocalDate.now();
        peopleCount++;
        System.out.println("Person(String, int, LocalDate) 생성");
    }

    // 기능
    // getter / setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        // this.age =age;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String personInfo() {
        return String.format("name : %s \t age: %d \t birtday : %3$tY-%3$tm-%3$td ", name, age, birthDay);
    }

    //final이 붙으면 상속되지 않는다!!
    public static final int getPeopleCount() {
        return peopleCount;
    }
}
