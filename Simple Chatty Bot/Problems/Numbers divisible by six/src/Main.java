import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int elements = s.nextInt();
        // first take in the number of elements
        // you will use that in the upcoming for loop
        int x;
        // need to initialize this variable before the loop
        int total = 0;
        // need to initialize this integer and set it equal to zero.
        for (x = 1; x <= elements; x++) {
            // starting at 1 ; going to elements REMEMBER EQUALS ; going up by 1
            int y = s.nextInt();
            // set a new integer y equal to the next input
            if (y % 6 == 0) {
                // if y is divisible by 6, then the remainder will be 0
                // if the expression (remainder of y / input) == 0 then
                total = total + y;
                // set the variable total equal to itself plus y
            }
        }
        System.out.println(total);
        // print out the end total -
        // remember to place the print statement after for loop }
    }
}