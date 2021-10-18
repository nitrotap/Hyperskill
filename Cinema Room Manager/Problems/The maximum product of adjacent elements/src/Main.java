import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here


        Scanner s = new Scanner(System.in);

        int len = s.nextInt(); // reading a length
        int[] noms = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            noms[i] = s.nextInt(); // read the next number of the array
        }

        int[] maxProd = new int[len];  // MAX product array


        for (int i = 0; i < len - 1; i++) {
            maxProd[i] = noms[i] * noms[i + 1];
            // in this loop i intend to find the max of
            // need to make an array of the max product of numbers
            // need to loop through that array and output the max
            // PRODUCT OF TWO ADJACENT ELEMENTS
            // how many products can i expect in the loop?
        }


        // System.out.println(Arrays.toString(maxProd));

        // need another loop to loop through the array maxProd and find the maximum
        // find the maximum by using java.util.Collections then using
        // Collections.min() and Collections.max()
        // or not
        int max = maxProd[0];
        for (int i = 0; i < len - 1; i++) {
            if (maxProd[i] > max) {
                max = maxProd[i];
            }
        }
        System.out.println(max);
    }
}