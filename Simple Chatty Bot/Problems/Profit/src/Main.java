import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        double m = s.nextInt();
        double p = s.nextInt();
        double k = s.nextInt();
        int x = 0;

        while (m < k) {
            x++;
            m = m + m * p / 100;
        }
        System.out.println(x);
    }
}
