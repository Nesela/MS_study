package array01.basic;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args){
        array01();
        array02();
    }

    public static void array02() {
        String[][] fruits = new String[3][];
        fruits[0] = new String[2];
        fruits[1] = new String[1];
        fruits[2] = new String[3];
        /*
        {
            {null, null},
            {null},
            {null, null, null}
       }
         */

        fruits[0][0] = "pear";
        fruits[0][1] = "dragonfruit";

        fruits[1][0] = "cherry";

        fruits[2][0] = "orange";
        fruits[2][1] = "raspberry";
        fruits[2][2] = "mandarin";

        System.out.println("{");
        for (int i = 0 ; i< fruits.length ; i++){
            System.out.printf("{");
            for (int j = 0; j < fruits[i].length; j++) {
                System.out.printf("%s ", fruits[i][j]);
            }
            System.out.println("}");
        }
        System.out.println("}");
    }

    public static void array01() {
        // { {0, 0, 0}
        // , {0, 0, 0} }
        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.printf("{ ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("{ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println(" }");
        }
        System.out.println(" }");

        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));
    }

}
