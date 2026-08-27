package class01.basic;

public class Soldier {
    private static int count;

    public Soldier() {
        count++;
    }

    public static void countSoldier() {
        System.out.println(count + "명");
    }

    public void death() {
        count--;
    }
}
