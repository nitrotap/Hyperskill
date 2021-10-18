import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        boolean a = 't';
        boolean b = false;
        boolean c = True;
        boolean d = true;
        boolean e = 'false';
        boolean f = 1;
        boolean g = 'true';
        boolean h = 0;*/
        /*
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b1 && b1 || b3);
         */
        /*
        boolean b1 = true;
        boolean b2 = false;

        // System.out.println(b1 ^ b2);
        System.out.println("b1 && b2");
        System.out.println(b1 && b2);
        System.out.println("!b1 && b2");
        System.out.println(!b1 && b2);
        System.out.println("b1 ^ b2");
        System.out.println(b1 ^ b2);
        System.out.println("b1 || b2");
        System.out.println(b1 || b2);
         */
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        boolean result = (a >= b) && (b != c);

        System.out.println(result);

    }
}