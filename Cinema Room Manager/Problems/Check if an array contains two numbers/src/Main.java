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

        int n = s.nextInt();
        int m = s.nextInt();
        boolean containsTwo = false;

        for (int i = 0; i < len - 1; i++) {
            // set a boolean equal to the answer

            // if statement if n and m are next to each other
            // this checks if they are next to each other one way but not the other
            if (noms[i] == n && noms[i + 1] == m) {
                containsTwo = true;
            }
            if (noms[i] == m && noms[i + 1] == n) {
                containsTwo = true;
            }
        }
        System.out.println(containsTwo);


        // System.out.println(Arrays.toString(maxProd));
    }
}