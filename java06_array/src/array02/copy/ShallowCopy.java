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


    }
}
