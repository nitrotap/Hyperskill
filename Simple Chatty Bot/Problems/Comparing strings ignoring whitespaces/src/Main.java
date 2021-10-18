import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        //Scan the lines in as whole lines, including whitespaces
        String first = s.nextLine();
        String second = s.nextLine();

        // Trim the ends and starts of the lines
        String firstTrim = first.trim();
        String secondTrim = second.trim();

        //replace whitespaces within the lines
        String firstFinal = firstTrim.replaceAll(" ", "");
        String secondFinal = secondTrim.replaceAll(" ", "");

        // Print the output
        System.out.println(firstFinal.equals(secondFinal));




    }
}