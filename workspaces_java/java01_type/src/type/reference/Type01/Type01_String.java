package type.reference.Type01;

public class Type01_String {
    public static void main(String[] args){
        // String : 참조타입이지만 기본타입 처럼 사용 가능
        String s01 = "aaa";
        String s02 = "bb";
        String concat = s01 + s02;
        System.out.println(concat);

        String s03 = """
                cccc
                dddd
                """;
        System.out.println(s03);

        System.out.println(concat.toUpperCase());
    }
}
