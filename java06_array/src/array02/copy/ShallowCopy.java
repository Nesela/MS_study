package array02.copy;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = original;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));

        System.out.println(original);
        System.out.println(copy);

        copy[0] = 100;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));

        /*
        config (설정) 객체를 복사하는 경우 (ex. 설정파일 바로가기 해놓은 상태 느낌)
        객체를 read 만 하는 경우
        불변 객체
         */
    }
}
