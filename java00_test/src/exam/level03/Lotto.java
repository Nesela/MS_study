package exam.level03;

public class Lotto {
    // 로또 배열 생성
    private int[] make() {
        int[] arr = new int[6];
        int index = 0;


        return arr;
    }

    // 중복 값 판별
    private boolean isSame(int[] arr, int insert) {
        boolean same = false;


        return same;
    }
    // 정렬
    private void sorting(int[] arr) {


    }

    public void prn() {
        int[] arr = make();
        sorting(arr);
        // Arrays.sort(arr);

        System.out.print("[ ");
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
