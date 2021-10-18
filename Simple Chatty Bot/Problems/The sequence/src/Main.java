import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int elements = s.nextInt();
        int highest = 0;
        int i = 0;

        // the following uses a while loop, but still requires a break command
        // because of the if loop. a break isnt terrible but id like to avoid it
        /* doesn't work
        while (i <= elements) {
            i++;
            int input = s.nextInt();
            if (input % 4 == 0 & input > highest) {
                highest = input;
            } else {
                break;
            }
        }
        System.out.println(highest);*/

        // find the highest number divisible by 4 from the list
        /*for (i = 1; i <= elements; i++) {
            int input = s.nextInt();
            while (input % 4 == 0 && input > highest) {
                highest = input;
            }
        }
        System.out.println(highest);*/


        /*
        for (x = 1; x <= elements; x++) {
            // starting at 1 ; going to elements REMEMBER EQUALS ; going up by 1
            int y = s.nextInt();
            // set a new integer y equal to the next input
            if (y % 4 == 0) {
                // if y is divisible by 4, then the remainder will be 0
                // if the expression (remainder of y / input) == 0 then
                highest = y;
                // set the variable to y
            }
        }*/
        //System.out.println(highest);
        // print out the end total -
        // remember to place the print statement after for loop }
    }
}