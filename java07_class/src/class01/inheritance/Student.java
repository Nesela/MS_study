package class01.inheritance;

import java.time.LocalDate;

public class Student extends Person{

    private String school;

    public Student() {
        //super();
        this.school = "";
        System.out.println("Student() 생성");
    }

    public Student(String name, int age, LocalDate birthday) {
        super(name, age, birthday);
        this.school = "홍익대";
        System.out.println("Student(name, age, birthday) 생성");
    }

    public Student(String name, int age, LocalDate birthday, String school) {
        this.school = school;
        System.out.println("Student(name, age, birthday, school");
    }

    // override : 재정의 (부모가 만들어놓은 것과 껍데기는 동일한데, 내용은 내 맘대로)
    @Override
    public String personInfo(){
        // super : 부모 객체
        // this : 나 객체
        return String.format("%s \t school : %s", super.personInfo(), this.school);
    }

    public String studentInfo() {
        // super.name 안되는 이유 : name이 private 이라서!!
        // birthday 안되는 이유 :
        return String.format("name : %s \t age : %d \t school : %s", super.getName(), super.getAge(), this. school);

    }

}
