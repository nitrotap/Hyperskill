package cinema;
import java.util.*;

public class previoustriesthree {
        public static void main(String[] args) {
            // Write your code here
            Scanner s = new Scanner(System.in);

            System.out.println("Enter the number of rows:");
            int numOfRows = s.nextInt();
            System.out.println("Enter the number of seats in each row:");
            int seatsPerRow = s.nextInt();



            //  WRAP INTO A METHOD FOR PRINTING THE CINEMA
            System.out.println("Cinema:");
            System.out.print("  ");
            int topRow[] = new int[seatsPerRow];
            for (int i = 0; i < seatsPerRow; i++) {
                topRow[i] = i + 1;
                System.out.print(topRow[i] + " ");
            }
            String seatArray[][] = new String[numOfRows][seatsPerRow];


            System.out.println("");
            int firstCol[] = new int[numOfRows];
            for (int i = 0; i < numOfRows; i++) {
                firstCol[i] = 1 + i;
                System.out.print(firstCol[i] + " ");

                for (int a = 0; a < numOfRows; a++) {
                    for (int b = 0; b < seatsPerRow; b++) {
                        seatArray[a][b] = "S";
                    }
                }
                for (int j = 0; j < seatsPerRow; j++) {
                    System.out.print(seatArray[i][j] + " ");
                }
                System.out.println("");
            } // END PRINT CINEMA



            // NEW METHOD FOR SHOWING THE PROFIT
            // BUT I DONT THINK PROFIT IS NEEDED ANYMORE
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
            // END TO BE DELETED SECTION OF PROFIT


            // START TICKET PRICE SECTION NEW METHOD
            System.out.println("Enter a row number:");
            int rowNum = s.nextInt();
            System.out.println("Enter a seat number in that row:");
            int colNum = s.nextInt();
            int ticketPrice = 10;
            if (totalSeats > 60) {
                if (rowNum > numOfRows / 2) {
                    ticketPrice = 8;
                }
            }
            System.out.println("Ticket Price: $" + ticketPrice);

            System.out.println("Cinema:");
            System.out.print("  ");
            for (int i = 0; i < seatsPerRow; i++) {
                System.out.print(topRow[i] + " ");
            }
            System.out.println("");

            for (int i = 0; i < numOfRows; i++) {
                System.out.print(firstCol[i] + " ");
                for (int j = 0; j < seatsPerRow; j++) {
                    for (int a = 0; a < numOfRows; a++) {
                        for (int b = 0; b < seatsPerRow; b++) {
                            seatArray[rowNum - 1][colNum - 1] = "B";
                        }
                    }

                    System.out.print(seatArray[i][j] + " ");
                }
                System.out.println("");
            }

            // END TICKET PRICE SECTION

            /*
            for (int a = 0; a < numOfRows; a++) {
                for (int b = 0; b < seatsPerRow; b++) {
                    seatArray[rowNum][colNum] = "B";
                }
            }
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(seatArray[i][j] + " ");
            }
            System.out.println("");*/




        }
    }