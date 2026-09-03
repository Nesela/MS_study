package class09.sealed;

// sealed class 를 상속받으면, [sealed, non-sealed, final] 하나를 반드시 명시!
//sealed : 상속 제한 / non-sealed : 상속 제한 해제 / final : 상속 불가
public sealed class Carnivore extends Animal permits Tiger, Lion{
    public void eat() {
        System.out.println("고기를 냠냠");
    }
}
