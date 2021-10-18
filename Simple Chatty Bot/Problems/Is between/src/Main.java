import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // put your code here
        // first number is between the second and the third one (inclusive)
        // 40 100 20
        // a b c
        // 100 40 20
        // 1 2 3
        // so the difference between the two is 1 2 3 is ascending in values and 100 40 20 is descending
        // so the relation has to connect all 3
            // so a >= b and a <= c checks ascending order b <= a <= c
            // a greater than b and a less than c
        // need to check descending order as well
            // a less than b and a is greater than c
           // so a <= b and a >= c checks descending order c <= a <= b
        // SO the final expressions should be
        // b <= a && a <= c
        // c <= a && a <= b

        // gather inputs
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // is it possible to do multiple expressions in the same line?
        // YES

        // doesnt seem like it - so
        // a greater than b and a less than c
        boolean d = b <= a && a <= c;

        // a less than b and a is greater than c
        boolean e = c <= a && a <= b;

        //boolean f is defined if either d or e is true then return true
        boolean f = d || e;

        // System.out.println(d);
        // System.out.println(e);

        //System.out.println(e && d);
        System.out.println(f);
    }
}