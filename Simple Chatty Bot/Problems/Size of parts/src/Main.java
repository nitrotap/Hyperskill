import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        Size of parts
A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line containing the number of parts ready to be shipped,
the number of parts to be fixed, and the number of rejects.
         */
        int n = s.nextInt();
        // take in the number of parts
        int x;
        // initialize x for the loop
        int perfect = 0;
        // initialize tally for perfect items
        int larger = 0;
        // initialize tally for larger items
        int smaller = 0;
        // initialize tally for smaller items


        for (x = 1; x <= n; x++) {
            // for x starting at 1 ; going to or equals to n ; going up by 1
            int y = s.nextInt();
            // read the input and store as y
            if (y == 1) {
                // if 1 is read from input
                larger = larger + 1;
                // add one to the larger tally

            } else if (y == -1) {
                // if a -1 is read
                smaller = smaller + 1;
                // add one to smaller tally

            } else if (y == 0) {
                // if 0 is read
                perfect = perfect + 1;
                // add one to perfect tally;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}