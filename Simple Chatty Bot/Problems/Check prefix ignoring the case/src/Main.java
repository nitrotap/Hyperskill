import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        // Create Scanner
        Scanner s = new Scanner(System.in);
        // Read the input
        String first = s.nextLine();
        // System.out.println(first);
        // Need to ignore the case
        String second = first.toUpperCase();

        // Need to use the startsWith("J")
        System.out.println(second.charAt("0") == "J");
    }
}
