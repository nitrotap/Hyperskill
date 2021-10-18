import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        for (;;) {
            int y = s.nextInt();
            if (y == 0) {
                break;
            } else if (y % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num % 2 == 1 ? "odd" : "even");
        }
    }
}
 */