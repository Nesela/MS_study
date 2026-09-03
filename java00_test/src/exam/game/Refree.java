package exam.game;

public class Refree {

    /*
    0 : Gawi
    1 : Bawi
    2 : Bo
            player
            0   1   2
    com 0   d   w   l
        1   l   d   w
        2   w   l   d
     */

    public static String whoWin(int com, int player) {
        String[][] winDrawLose = new String[3][];
        winDrawLose[0] = new String[]{"draw", "win", "lose"};
        winDrawLose[1] = new String[]{"lose", "draw", "win"};
        winDrawLose[2] = new String[]{"win", "lose", "draw"};

        return winDrawLose[com][player];
    }

}
