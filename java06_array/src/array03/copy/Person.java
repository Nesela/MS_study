package array03.copy;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\t" + age;
    }
}
