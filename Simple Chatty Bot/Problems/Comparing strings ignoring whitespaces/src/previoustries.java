import java.util.Scanner;

class previoustries {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in).useDelimiter(" ");

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String firstTrim = firstString.trim();
        String secondTrim = secondString.trim();

        // System.out.println(secondString);
        // System.out.println(secondTrim);

        String finalTrim = secondTrim.replaceAll(" ", "");

        // System.out.println(finalTrim);

        System.out.println(finalTrim.equals(firstTrim));

        // Scanner s = new Scanner(System.in).useDelimiter("\\n");
        // Do i need a second scanner here?
        /*

        String thirdString = scanner.nextLine();
        String fourthString = scanner.nextLine();

        // System.out.println(thirdString);
        //System.out.println(fourthString);

        String thirdTrim = thirdString.trim();
        String fourthTrim = fourthString.trim();

        // System.out.println(thirdTrim);
        // System.out.println(fourthTrim);

        String finalTrim2 = fourthTrim.replaceAll(" ", "");

        // System.out.println(finalTrim2);
        //System.out.println(thirdTrim);

        System.out.println(finalTrim2.equals(thirdTrim));

         */
    }
}
