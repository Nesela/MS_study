package class08.nested;

public class NestedMain {
    public static void main(String[] args){
        TopLevelClass.StaticClass.prn();


        // ?
        TopLevelClass.localClass();

        TopLevelClass top = new TopLevelClass();
        TopLevelClass.InnerClass inner = top.new InnerClass();

        top.anonymous.run();

    }
}
