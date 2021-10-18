import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            System.out.println("YES");
        } else if (a <= 0) {
            System.out.println("NO");
        }
    }
}
