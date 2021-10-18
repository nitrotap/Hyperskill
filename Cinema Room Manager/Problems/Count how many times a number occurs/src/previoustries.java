import java.util.Scanner;

public class previoustries {
        public static void main(String[] args) {
            // put your code here
/*

int len = scanner.nextInt(); // reading a length
int[] array = new int[len];  // creating an array with the specified length

for (int i = 0; i < len; i++) {
    array[i] = scanner.nextInt(); // read the next number of the array
}

System.out.println(Arrays.toString(array)); // output the array
 */
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = s.nextInt();
            }

            // System.out.println(Arrays.toString(nums));
        }
    }