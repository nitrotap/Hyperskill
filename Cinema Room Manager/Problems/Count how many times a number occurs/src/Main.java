import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        //System.out.println(len);
        // PRINT AN ARRAY
        //System.out.println(Arrays.toString(array));
        //System.out.println(n);
        System.out.println(count);


        /*
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i == n) {
                count++;
            }*/
    }

    // System.out.println(count);

    //System.out.println(Arrays.toString(array)); // output the array
}