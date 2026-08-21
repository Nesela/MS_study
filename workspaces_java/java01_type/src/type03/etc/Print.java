package type03.etc;

public class Print {
    /*
    print : 줄 바꿈없음
    println : 줄 바꿈 포함 (line)
    printf " formatter (자리 or 형식)
     */
    public static void main(String[] args) {
        String name = "jaebeom";
                int age = 100;
        System.out.print("1. name : " + name + "\n");
        System.out.println("2. age : " + age);
        System.out.printf("3. format : _%10d_%5d\n", age, age);
        System.out.printf("4. format : %s %d\n", name, age);

        double pi = 3.1241592;
        String formatString = String.format("My name is %s. \nPI = %.2f", name, pi);
        System.out.println(formatString);
    }
}
