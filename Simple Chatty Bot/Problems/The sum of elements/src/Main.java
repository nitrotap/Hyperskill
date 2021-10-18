import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        /*
        Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.


Sample Input:
3
6
8
0

Sample Output:
17
         */

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int input;
        do { // do loop
            input = s.nextInt(); // read input
            sum = sum + input; // add input to sum
        } while (input != 0);

        System.out.println(sum);

    }
}