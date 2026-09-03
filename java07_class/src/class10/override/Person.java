package class10.override;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            Person other = (Person) obj;

            if ((this.name.equals(other.name)) && (this.age == other.age)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "name : " + this.name + " \t age : " + this.age;
    }
}
