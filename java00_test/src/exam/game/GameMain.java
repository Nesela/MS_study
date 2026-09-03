package exam.game;

public class GameMain extends Refree{
    public static void main(String[] args) {
        int cnt = 1;

        Computer com = new Computer();
        Player player = new Player();
        System.out.println("Gawi Bawi Bo!!");

        do {
            com.setSelect();
            player.setSelect();

            String player_result = player.getHand();
            if (player_result.equals("Exit")) {
                System.out.println("good bye");
                break;
            }
            System.out.printf("""
                    %d 판 째...
                    Computer : %s vs Player : %s
                    Result : %s
                    """, cnt++,
                        com.getHand(), player_result,
                        whoWin(com.getSelect(), player.getSelect()));

        } while (true);
    }
}
