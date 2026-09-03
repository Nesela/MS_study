package class01.inheritance;

import java.time.LocalDate;

public class StudentMain {
    public  static void main(String[] args) {
        Student hong = new Student();

        // inheritance
        System.out.println(hong.getName());
        System.out.println(hong.personInfo());

        Student kim = new Student("kim-sd", 100, LocalDate.of(2000, 1, 1));

        Student lee = new Student("lee-ss", 50, LocalDate.of(2026, 9, 1 ), "한산도대학");

        //
        Person a = new Person();
        System.out.println(a.personInfo());
//        System.out.println(a.studentInfo());

        Person b = new Student();
        System.out.println(b.personInfo());
//        System.out.println(b.studentInfo());

//        Student c = new Person();
    }
}
