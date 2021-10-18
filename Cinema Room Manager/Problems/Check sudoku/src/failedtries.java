import java.util.Scanner;

public class failedtries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // set up scanner

        int n = s.nextInt(); // read input size
        int[][] puzzle = new int[n * n][n * n]; // initialize array with n^2

        for (int i = 0; i < n * n; i++) { // loops over rows
            for (int j = 0; j < n * n; j++) { //  loops over the columns
                puzzle[i][j] = s.nextInt();
            }
        }
        // so column must equal n * n
        // row must equal n * n
        // square must equal n * n
        // start with row
        // so row i must sum to n * n

        int rowsum[] = new int[n*n];
        int colsum[] = new int[n*n];
        boolean test = false;
        for (int i = 0; i < n * n; i++) {
            // i want to sum the row  so iterate through each row i
            for (int j = 0; j < n * n; j++) {
                rowsum[i] = rowsum[i] + puzzle[i][j]; // this gives me the sum of each row
            }
            for (int j = 0; j < n * n; j++) {
                colsum[j] = colsum[j] + puzzle[i][j]; // this gives me the sum of each column
            }
            if (rowsum[i] == colsum[i]) {  // if row sums are equal to col sums then sudoku is true
                test = true;
            }
        }

        // here i am checking for duplicates within each row and column
        for (int i = 1; i < n * n; i++) {
            for (int j = 1; j < n * n; j++) {
                if (puzzle[i][j] == puzzle[i - 1][j] || puzzle[i][j] == puzzle[i][j - 1]) {
                    test = false;
                }
            }
        }
        for (int i = 0; i < n * n; i += n) {
            for (int j = 0; j < n * n; j += n) {
                for (int m = 0; m < n * n - 1; m++) {
                    for (int a = m + 1; a < n * n; a++) {
                        if (puzzle[i + m%n][j + m / n] == puzzle[i + m %n][j + m/n]) {
                            test = false;
                        }
                    }
                }
            }
        }

        /*
        // grid checker
for(int row = 0; row < 9; row += 3)
   for(int col = 0; col < 9; col += 3)
      // row, col is start of the 3 by 3 grid
      for(int pos = 0; pos < 8; pos++)
         for(int pos2 = pos + 1; pos2 < 9; pos2++)
            if(s[row + pos%3][col + pos/3]==s[row + pos2%3][col + pos2/3])
               return false;
         */
        //

            /* here I need to check the n by n square but i dont know how yet
            for (int j = 0; j < n * n; j++) {
                colsum[j] = colsum[j] + puzzle[i][j]; // this gives me the sum of each column
            }*/

        String sudoku = "NO";
        if (test == true) {
            sudoku = "YES";
        }
        //System.out.println(Arrays.toString(rowsum));
        //System.out.println(Arrays.toString(colsum));
        //System.out.println(test);
        System.out.println(sudoku);





        /*
        for (int i = 0; i < n * n; i++) {
            System.out.println(Arrays.toString(puzzle[i]));
        }*/


    }
}
