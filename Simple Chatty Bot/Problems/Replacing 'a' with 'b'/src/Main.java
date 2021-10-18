import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in).useDelimiter("");

        String ans1 = s.nextLine();
        ///String ans2 = s.next();
        //String ans3 = s.next();

        String replacer1 = ans1.replace("a", "b");

        System.out.println(replacer1);

    }
}
