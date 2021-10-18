import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        /*
        Write a program that prints x ; x number of times ; until x + (x + 1) equals input number
         */

        int a = s.nextInt();
        int i;
        int j = 1;
        //System.out.println(a);
        //System.out.println(y);
        /*
        for (starting at 0; going to input; going up by 1) {
            increment i by 1;*/

        /*
        so i need to loop through a times but change the print function
         */

        int count = 1;
        for (i = 0; i <= a; i++) {
            for (j = 0; j < i; j++) {
                if (count > a) {
                    break;
                }
                count++;
                System.out.print(i + " ");
            }
        }
        /*
        for(i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                count++;
                if (i + j >= a) {
                    System.out.print(j);
                    break;
                }
                System.out.print(i + "");
            }
        }*/


        /*
        Really close; fails test # 3 needs a counter i think
        for (i = 1; i <= a ; i++) {
            if (i + j >= a) {
                System.out.println(j);
                break;
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
                }
            }*/

        /*
        answer is correct, but fails test # 3
        for (i = 1; i <= a ; i++) {
            System.out.print(i + " ");
            if (i + j == a) {
                break;
            }
            for (j = 1; j < i; j++) {
                System.out.print(i + " ");
            }

        }*/

        /* really close - this prints each number, that number times
        but i need each number to print until number + number + 1 is input
        for (i = 1; i <= a; i++) {
            System.out.println(i); // loops over a times and prints the loop
            for (j = 1; j < i; j++) {
                System.out.println(i);
            }
        }*/



        /*for (i = 1; i <=a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(j); // this loops 1-4 4 times
            }
        }*/


        /*/for (i = 1; i <= a; i++) {
            System.out.println(i); // loops a times
            for (j = 1; j <= i; j++) { // loops a times 1 through a
                System.out.println(j); // this ends up looping though the numbers and printing
                // 1 1 2 1 2 3 1 2 3 4  - so really close but printing the wrong thing
            }
        }*/
        /*
        while (i < a) {
            i++;
            System.out.println(i); // prints i ascending to a
            // i want to print out i, i number of times
            /* Prints 1 through y an infinite number of times
            for (i = 1; i < y; i++) {
                System.out.println(i);
            }
        }*/
    }
}
