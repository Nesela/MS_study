package class10.override;

public class PersonMain {
    public static void main(String[] args){
        Person person01 = new Person("hong-gd", 100);
        Person person02 = person01;

        System.out.println(person01.equals(person02));
        System.out.println(System.identityHashCode(person01));
        System.out.println(System.identityHashCode(person02));

        Person person03 = new Person("hong-gd", 100);
        System.out.println(person01);
        System.out.println(person03);
        System.out.println(person01.equals(person03));
        System.out.println(System.identityHashCode(person01));
        System.out.println(System.identityHashCode(person03));
    }
}
