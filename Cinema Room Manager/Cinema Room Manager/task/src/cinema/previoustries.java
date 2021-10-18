package cinema;
import java.util.Scanner;
import java.lang.Math;

public class previoustries {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        System.out.println("1 S S S S S S S S");

        int i;
        int j;
        for (i = 2; i <=7 ; i++) {
            System.out.print(i + " ");
            for (j = 1; j <= 8; j++) {
                System.out.print("S" + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Enter the number of rows:");
        int numOfRows = s.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = s.nextInt();

        int totalSeats = numOfRows * seatsPerRow;

        if (totalSeats <= 60) {
            int smallRoomTicket = 10;
            int smallRoomTotal = totalSeats * smallRoomTicket;
            System.out.println("Total income:");
            System.out.println("$" + smallRoomTotal);
        }

        if (totalSeats > 60) {
            int frontHalf = (int) Math.floor(numOfRows / 2);
            int backHalf = (int) Math.ceil(numOfRows / 2.0);

            System.out.println(frontHalf);
            System.out.println(backHalf);

            int frontTotal = frontHalf * 10 * seatsPerRow;
            int backTotal = backHalf * 8 * seatsPerRow;

            int largeTotal = frontTotal + backTotal;
            System.out.println("Total income:");

            System.out.println("$" + largeTotal);
        }
    }
}