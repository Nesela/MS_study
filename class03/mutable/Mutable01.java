package class03.mutable;

public class Mutable01 {
    public static void main(String[] args) {
        immutable();
        mutable();
    }

    public static void immutable() {
        String str01 = "java";
        System.out.println(str01);
        System.out.println(System.identityHashCode(str01));

        String str02 = str01 + "!!";
        System.out.println(str02);
        System.out.println(System.identityHashCode(str02));

        // string Pool (string constant pool)
        System.out.println(System.identityHashCode("java"));
        System.out.println(System.identityHashCode("java!!") + "vs" + System.identityHashCode(str02));
    }

    public static void mutable() {
        String str= new String("java");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode("java"));

        // StringBuilder : 동기화 처리가 없어 단일 thread 일 때 더 빠르다.
        // StringBuffer : threadsafe 보장.
        StringBuilder sb01 = new StringBuilder("java");
        System.out.println(sb01);
        System.out.println(System.identityHashCode(sb01));

        sb01.append("!!");
        System.out.println(sb01);
        System.out.println(System.identityHashCode(sb01));

        StringBuffer sb02 = new StringBuffer("java");
        System.out.println(sb02);
        System.out.println(System.identityHashCode(sb02));
    }

}
