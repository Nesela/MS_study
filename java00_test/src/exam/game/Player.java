package exam.game;

import java.util.Scanner;

public class Player extends GawiBawiBo{
    public void setSelect() {
        System.out.println("input select\n1: Gawi \t 2: Bawi \t 3: Bo \t 9: Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 9) {
            super.setSelect(3);
        } else {
            super.setSelect(input-1);
        }
    }
}
