import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int b;

        boolean asc = true;
        boolean desc = true;

        while (true) {
            b = first;
            first = s.nextInt();

            if (first == 0) {
                break;
            }

            if (asc && first < b) {
                asc = false;
            }

            if (desc && first > b) {
                desc = false;
            }

            if (!asc && !desc) {
                break;
            }
        }

        System.out.println(desc || asc);






        // only works for first 3 need to iterate
        /*
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        boolean asc = first <= a && a <= b;
        boolean desc = first >= a && a >= b;
        boolean combo = asc || desc;

        //System.out.println(asc);
        //System.out.println(desc);
        System.out.println(combo);*/

        // read each number n, might read entire sequence
        // check ascending order boolean values
        // check descending order boolean values

        // hints said to use 2 conditionals 1 for checking asc 1 for desc
        // Assume ordered until proven otherwise

        // maybe i need 2 loops, one for ascending, one for descending

        // not working
        // having trouble printing the answer out of the loop
        /*
        for ( ; ; ) {
            int number = s.nextInt();
            //System.out.println(number);
            if (number == 0) { // stop when you hit zero
                break;
            }
            int b = s.nextInt();
            //System.out.println(b);
            int c = s.nextInt();
            //System.out.println(c);

            boolean asc = (number <= b && b <= c);
            System.out.println( "asc test" + asc );
            boolean desc = number >= b && b >= c;
            System.out.println("desc test" + desc);
            k = asc || desc;
            System.out.println("combo test" + k);
            System.out.println(k);

        }*/


        /* DOESNT work try just 1 loop
        // loop over each number
        for (int i = 1; s.nextInt() == 0; i++) {
            int number = s.nextInt();
            if (number == 0) { // stop when you hit zero
                break;
            }
            //System.out.print(number); // print out the looped numbers
            // need to loop for each number, check number before and after
            // TODO need to put in if the read integer equals itself
            for (int j = 1; ; j++) {
                // loop over the next number in the sequence
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();

                // so 1 2 3
                //    a b c   ascending order a less than b less than c
                boolean asc = (a <= b && b <= c);
                //
                // 3 2 1
                // a b c
                boolean desc = a >= b && b >= c;

                boolean k = asc && desc;
                System.out.println(k);
            }
        }*/

        // read input as whole, then iterate over the input maybe?
        // not sure trying first one
        // String input = s.nextLine(); //  reads whole input string
        // System.out.println(input);
        // System.out.println(input.length());
        // if ( input.length() <= 2 || input[i] == 0 ) {
            // break;
    }
}