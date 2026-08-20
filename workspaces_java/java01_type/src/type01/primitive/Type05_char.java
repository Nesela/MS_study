package type01.primitive;

public class Type05_char {
    public static void main(String[] args){
        // For char, from '\u0000' to '\uffff' inclusive, that is, from 0 to 65535

        char c01 = 'a';
        System.out.println(c01);

        char c02 = 'A';
        System.out.println(c02);

        int c01ToInt = (int)c01;
        System.out.println(c01ToInt);

        // ascii code 참고 !!
    }
}
