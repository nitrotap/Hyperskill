import java.util.Arrays;
import java.util.Scanner;

class multidimarraysnotes {
    public static void main(String[] args) {
        // put your code here
        // two-dim array - the array of arrays
        /*
        int[][] twoDimArray = {
                {1, 2, 3, 1}, // first array of int
                {3, 4, 1, 2}, // second array of int
                {4, 4, 1, 0}  // third array of int
        };

        // System.out.println(Arrays.toString(twoDimArray));

        int number = twoDimArray[0][2]; // it is 3
        System.out.println(number);*/

        int[][] twoDimArray = new int[3][];

        twoDimArray[0] = new int[] { 1, 2, 3, 4 }; // the length is 4
        twoDimArray[1] = new int[] { 5, 7, 3};     // the length is 3
        twoDimArray[2] = new int[] { 8 };          // the length is 1

// let's output the array
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }
        //int[][][] cubic = new int[3][4][5];
        // Actually, this cubic array is represented as three 2-dimensional arrays 4x5.

        int[][][] cubic = new int[3][4][5]; // a three-dimensional array (cube)

        int current = 1; // it stores a value to fill elements

        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = current; // assign a value to an element
                }
            }
            current++; // get the next value to the next "matrix"
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }









    }
}