package type.reference;

public class Type06_casting {
    public static void main(String[] args){
        // 묵시적 형 변환 : 작은 타입에서 큰 타입으로  변환되는 과정 - promotion (upCasting)
        byte b01 = (byte) 100;
        int i01 = b01;
        System.out.println(i01);

        // 명시적 형 변환 : 큰 타입에서 작은 타입으로 변환되는 과정 - demotion (downCasting)
        int i02 = 100;
        byte b02 = (byte)i02;
        System.out.println(b02);

    }
}
