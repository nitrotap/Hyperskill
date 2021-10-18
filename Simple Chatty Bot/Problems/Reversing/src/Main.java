import java.util.Scanner;

/*
class Main{
    public static void main(String[] args) {

        /* int n = 10;

        int first = ++n;
        this changes n to 11
        int s = n+=1;
        this also changes n to 11
        int s = n + 1;
        this does not modify n

        int s = n++;


        System.out.println(n);

    }
}*/


class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in).useDelimiter("");
        String num1 = s.next();
        String num2 = s.next();
        String num3 = s.next();
        String strfinal = num3 + num2 + num1;
        int numfinal = Integer.parseInt(strfinal);
        System.out.println(numfinal);
    }
}