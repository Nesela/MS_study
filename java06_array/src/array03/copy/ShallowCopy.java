package array03.copy;

public class ShallowCopy {
    public static void main(String[] args){
        Person[] original = new Person[] {
                new Person("hong-gd", 10),
                new Person("kim-sd", 20),
        };

        System.out.println(original[0]);

        Person[] copy = original.clone();

        System.out.println(copy[0]);

        //다름
        System.out.println(original == copy);

        //같다
        System.out.println(original[0] == copy[0]);
    }
}
