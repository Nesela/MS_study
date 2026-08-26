package class04.exam;

public class Student {

    private String name;
    private String id;
    private int age;
    private String phone;

    //constructor : 생성자 => [접근제한자] className
    public Student() {
        //내부 생성자 호출
        this("철수", "no1", 10, "010-1111-111");
    }

    public Student(String name, String id, int age, String phone) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phone = phone;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = (age >= 0 ) ? age : 0;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //method : 기능 (function)
    //접근제한자 static/non-static return-type methodName(parameter) {}
//    public void prn() {
//        System.out.printf("%s : %d 살", this.name, this.age);
//    }

    // parameter : 전달되는 값을 받아서, 해당 method 내부에서 사용할 지역"변수"
    public void prn(String job) {
        System.out.printf("%s : %d 삶 \t 직업은 : %s", this.name, this.age,job);
    }

}
