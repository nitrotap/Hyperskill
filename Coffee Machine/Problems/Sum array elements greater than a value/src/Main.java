import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (input[i] > n) {
                sum += input[i];
            }
        }
        System.out.println(sum);

    }
}