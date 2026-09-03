package exam.level01;

import java.util.Random;

public class Random01 {
    // java.util.Random
    public static void randomClass() {
        Random rd = new Random();
        System.out.println(rd.nextInt(100));
    }

    // java.lang.Math
    public static void mathClass() {
        // 0.0 <= ran < 1.0
        double ran = Math.random();
        // System.out.println(ran);

        // (int)(Math.random()*(max - min + 1)) + min
        // 0 ~ 10 사이의 랜덤값
        int rand = (int)(Math.random()*(10-0+1)) + 0;
        System.out.println(rand);

        // 100~ 110 사이의 랜덤값
        int hRan = (int)(Math.random()*(110-100+1)) + 100;
        System.out.println(hRan);
    }

    public static void main(String[] args) {
        mathClass();
        randomClass();
    }
}
