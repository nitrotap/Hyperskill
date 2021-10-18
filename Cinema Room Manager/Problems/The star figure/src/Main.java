import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        String star = "*";
        String dot = ".";

        String[][] twoDimArray = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimArray[i][j] = dot;  // fill with "." symbols
            }
            // fill middle row with *
            // mid row is n/2 + 1
            int midRow = n / 2;
            for (int j = 0; j < n; j++) {
                twoDimArray[i][midRow] = star;
            }
            int midCol = n / 2;
            for (int j = 0; j < n; j++) { // fill middle col with *
                twoDimArray[midCol][j] = star;
            }

            for (int j = 0; j < n; j++) { // fill right diagonal
                if (i == j) {
                    twoDimArray[i][j] = star;
                }
            }
            for (int j = 0; j < n; j++) { // fill left diagonal
                if (i + j == n - 1) {
                    twoDimArray[i][j] = star;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }

            System.out.println();

            //System.out.println(Arrays.toString(twoDimArray[i]));



        }




/*
        for (String[] strings : twoDimArray) {
            System.out.println(Arrays.toString(strings));
        }*/



    }
}