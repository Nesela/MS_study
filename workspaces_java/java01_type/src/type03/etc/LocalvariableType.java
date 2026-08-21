package type03.etc;

public class LocalvariableType {
    public static void main(String[] args){
        /*
        var : 지역 변수 타입 추론 (Local Variable Type Inference)
        - compile 시 값의 type을 추런 => 이후에 다른 type으로 변환 불가
        - 지역변수 에서만 사용 가능
        - 반드시 초기화 필요 (선언으로 끝나면 안됨)
        - null로 초기화 불가
         */

        var i = Integer.valueOf(0);
        System.out.println(i);
        i = null;
        System.out.println(i);

        // var j = null;
        // var j;

        var j = 1;
        System.out.println(j);
//        j = "one";
    }
}
