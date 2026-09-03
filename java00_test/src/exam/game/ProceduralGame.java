package exam.game;

import java.util.Scanner;

public class ProceduralGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] gawibawibo = {"Gawi", "Bawi", "Bo", "Exit"};

        int cnt = 1;

        System.out.println("Gawi Bawi Bo~!!");;

        while (true) {
            System.out.println("""
                    input select
                    1: Gawi \t @: Bawi \t 3: Bo
                    """);

            int com = (int) (Math.random() * 3);
            int player;

            int input = sc.nextInt();

            if (input == 9) {
                player = 3;
            } else {
                player = input - 1;
            }

            if (player == 3) {
                System.out.println("good bye~");
                break;
            }

            String computerHand = gawibawibo[com];
            String playerHand = gawibawibo[player];

            String result;

            if (com == player) {
                result = "draw";
            } else if ((com == 0 && player == 1) || (com == 1 && player == 2) || (com == 2 && player == 0)) {
                result = "win";
            } else {
                result = "lose";
            }

            System.out.printf("""
                    %d 판 째...
                    computer : %s vs player : %s
                    result : %s
                    """, cnt++, computerHand, playerHand, result);

        }

        sc.close();
    }
}
