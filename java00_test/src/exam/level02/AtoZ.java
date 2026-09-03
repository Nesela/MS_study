package exam.level02;

// 다음과 같이 출력하자.
// a B c D e F g H i J k L m N o P q R s T u V w X y Z
public class AtoZ {
    public static void main(String[] args) {
        int ascii1 = 97;
        int ascii2 = 66;

        for (int i = 0; i < 26; i += 2) {
            System.out.printf("%c %c ", ascii1 + i, ascii2 + i);
        }
    }
}
