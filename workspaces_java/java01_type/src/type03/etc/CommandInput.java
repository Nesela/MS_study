package type03.etc;

import java.util.Scanner;

public class CommandInput {
    public static void main(String[] agrs){
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println(input);

        String inputIo = IO.readln();
        IO.println(inputIo);
    }
}
