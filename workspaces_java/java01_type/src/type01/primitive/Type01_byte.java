package type01.primitive;

public class Type01_byte {

    //package : 서로 관련있는 클래스들의 모음 ( * 폴더 == 디렉토리 )
    //keyword (예약어) : 언너 내에서 미리 정해놓은 단어 ( 유저는 사용불가능 )
    /*
    Primitive Type
        Number Type
            IntegralType : byte (1 byte ), short (2 byte ), int (4 byte), long(8 byte), char (2 byte)
            FloatingPoint Type : float (4 byte), double (8 byte)
        boolean (1 byte)
    */

    // program의 주 진입점
    // void main() {}
    public static void main(String[] args) {
        // type variable = literal
        // = : 대입 연산자
        // literal : 값 그 잡채

        byte b01 = 127;

        System.out.println(b01);

        byte b02 = (byte) 128;
        IO.println(b02);

        byte sum = (byte)(b01- 1);
        System.out.println(sum);
    }
}
