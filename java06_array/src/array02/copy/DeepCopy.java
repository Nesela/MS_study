package array02.copy;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] original = new int[]{10, 20, 30, 40, 50};

        // 방법 1
        int[] copy01 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy01[i] = original[i];
        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy01));

        copy01[0] = 100;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy01));

        // 방법 2
        int[] copy02 = original.clone();
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy02));

        copy02[1] = 200;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy02));

        //방법 3
        int[] copy03 = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy03));

        copy03[2] = 300;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy03));

        //방법 4
        // System.arrayCopy() 사용해서 copy04 만들어보기
        int[] copy04 = new int[original.length];
    }
}

