import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int d = a + b;
        int e = a + c;
        int f = b + c;

        //System.out.println(d);
        //System.out.println(e);
        //System.out.println(f);

        boolean g = d == 20;
        boolean h = e == 20;
        boolean i = f == 20;

        System.out.println(g || h || i);









    }
}