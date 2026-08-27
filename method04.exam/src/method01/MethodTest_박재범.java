package method01;

public class MethodTest_박재범 {

    public static String isEven(int nuber){
//        return nuber % 2 == 0;
//        if (nuber % 2 == 0){
//            return "짝";
//        } else {
//            return "홀";
//        }
        return (nuber % 2 == 0) ? "정답입니다" : "오답입니다";
    }

    public void prn(String name){
        System.out.println("안녕하세요, 제 이름은 박재범 입니다.");
    }
    public void prn(int age){
        System.out.printf("제 나이는 %d 살 입니다.\n", age);
    }
    public void prn(double ehae){
        System.out.printf("저는 %.2f %% 만큼 이해했습니다.\n", ehae);
    }

    public static String stringToupperCase(String i){
        String str = i.toUpperCase();
        return str;
    }

    public void compare(int i1, int i2){
        int resule = (i1> i2) ? i1 : i2;
        System.out.println(resule);
    }
}
