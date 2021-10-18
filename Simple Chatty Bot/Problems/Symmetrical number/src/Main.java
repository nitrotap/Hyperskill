import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in).useDelimiter("");
        String a = s.next();
        // System.out.println(a);
        // input number as string
        // take first 2 parts of string and set it equal to last 2
        // How do i get characters at 0,1 and characters at 2,3 and set equal

        String b = s.next();
        String c = s.next();
        String d = s.next();

        // combine Strings for first part and second part

        String e = a + b;
        String f = d + c;

        //System.out.println(e);
        //System.out.println(f);
        //System.out.println(e.equals(f));

        if (e.equals(f)) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }
}
