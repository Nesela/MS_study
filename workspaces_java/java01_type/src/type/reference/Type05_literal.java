package type.reference;

public class Type05_literal {
    public static void main(String[] args){
        // _로 자리수 구분 가능
        int integerLiteral = 100_000_000;
        System.out.println(integerLiteral);
        // 0.~~ 이면 0 생략 가능
        double floatingPointLiteral = 0.5;
        System.out.println(floatingPointLiteral);

        char characterLiteral = 'a';
        System.out.println(characterLiteral);

        boolean booleanLiteral = true;
        System.out.println(booleanLiteral);

        String stringLiteral = "Hello";
        System.out.println(stringLiteral);

        String textBlook = """
                Hello, Java;
                Hello, Intellij ideal;
                """;
        System.out.println(textBlook);

        // null literal
        /*
        참조타입만 null 가질 수 있다.
        - 기본타입은 메모리에 값 자체를 저장
        - 참조타입은 메모리에 같이 저장되어있는 주소를 저장 => 가리키는 주소가 없음을 나타나는 용도로 null 사용 = 비어있다.
         */

        // int i = null
        Integer i = null;
        System.out.println(i);
    }
}
