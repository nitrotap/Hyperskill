import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desk1 = scanner.nextInt();
        // System.out.println(desk1);

        int desk2 = scanner.nextInt();
        // System.out.println(desk2);

        int desk3 = scanner.nextInt();
        // System.out.println(desk3);

        int avgdesk = (desk1 / 2) + (desk2 / 2) + (desk3 / 2);
        int remdesk = (desk1 % 2) + (desk2 % 2) + (desk3 % 2);

        // System.out.println(avgdesk);
        // System.out.println(remdesk);
        System.out.println( avgdesk+ remdesk );

        /*
        int desk2 = scanner.nextInt();
        int desk3 = scanner.nextInt();

        int sumdesk = (desk1 + desk2 + desk3);
        int deskCount = (sumdesk % 2) + (sumdesk / 2);
        System.out.println(deskCount);
        */


    }
}