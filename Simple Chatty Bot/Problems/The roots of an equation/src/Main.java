import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        /*
        Given the numbers a,b,c,d. Output in ascending order all the integers between 0 and 1000
        which are the roots of the equation ax3+bx2+cx+d=0.

        If the specified interval does not contain the roots of the equation, do not output anything.
        Remember, that cubic equation always has 3 roots. Keep this in mind in order to optimize the code.
*/
        /*
        so the math part of this is algebra -
        what does x have to be to make the following equation equal to 0
        print blank if there is no answer
         */

        /* just plug and chug */

        for (int x = 0; x < 1001; x++) {
            // for x from 0-1000 add one to x
            // then check whether that assortment of x
            // for each integer x, when does a*(x*x*x) + b*(x*x) + c*x + d equal 0
            // print value of x where x equals 0
            if (a * (x * x * x) + b * (x * x) + c * x + d == 0) {
                System.out.println(x);
            } /*else {
                System.out.println();
            }*/
        }
    }
}

                /*for (int j = 0; j<1001; j++) {
                    // System.out.println(j); this is printing a thousand a thousand times
                    // i want to iterate over the equation three times for the cubic root
                    // NOPE NOT NEEDED
                    // so maybe i need another for statement here

                    for (int k = 0; k <1001; k++) {
                        //System.out.println(k); would print 1000 wayy too many times.
                        //but perfect for iterating values maybe
                        // now i have to figure out the equation
                        // what value does x have to be for the inputted numbers
                        // so the equation is a*(x*x*x) + b*(x*x) + c*x + d = 0
                        // NOPE this code is unnecessary

                    }
                */