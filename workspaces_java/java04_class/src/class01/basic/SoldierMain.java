package class01.basic;

public class SoldierMain {
    public static void main(String[] args){
        Soldier.countSoldier();

        Soldier soldier01 = new Soldier();
        Soldier soldier02 = new Soldier();

        Soldier.countSoldier();

        Soldier soldier03 = new Soldier();
        Soldier soldier04 = new Soldier();

        Soldier.countSoldier();

        soldier04.death();
        soldier04 = null;
        // soldier04 => null
        // 이 시점에서 soldier04가 원래 참조하고 있던 instance는 삭제되지않고 gc가 활동하기전까진 heap영역에 남아있다
        Soldier.countSoldier();
    }
}
