package method03.parameter;

import java.util.Arrays;

public class VariableArguments {

    public static void main(String[] args){
        printName("홍길동");
        printName("홍길동", "이순신");
        printName("홍길동", "이순신", "김선달");

    }

    // ... == 배열
    // variable arguments (VarArgs) : 가변인자
    // String... args == String[] args
    public static void printName(String... args){
        System.out.println(Arrays.toString(args));
    }
}
