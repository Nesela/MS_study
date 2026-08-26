package class04.exam;

public class StudentMain {
    public static void main(String[] args) {

        // type 변수 = 값;
        Student hong = new Student();
        // hong.Student(); => new연산자(키워드) 뒤에서 " 단 한번만 호출"

//        hong.age = -100;
//        System.out.println(hong.age);

        // readable => getter
        System.out.println(hong.getName());
        System.out.println(hong.getId());
        // hong.age = 100;

        // writable => setter
        hong.setName("홍길동");
        hong.setAge(20);

//        hong.prn();
        // argument(s) : 전달되는 값
        hong.prn("개발자");

        // 참조변수(객체) instanceof 클래스
        System.out.println(hong instanceof Student);
//        System.out.println(hong instanceof Person);
    }
}
