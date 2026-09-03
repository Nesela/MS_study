package exam.level02;

public class PrintStar {

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void star01() {


    }

    /*

     *****
     ****
     ***
     **
     *

     */

    public static void star02() {


    }

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void star03() {


    }

    /*

     *****
     ****
     ***
     **
     *

     */
    public static void star04() {


    }


    /*

     *
     ***
     *****
     *******
     *********

     */
    public static void star05() {

        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star01();
        star02();
        star03();
        star04();
        star05();
    }
}

