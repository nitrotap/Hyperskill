package cinema;

import java.util.Scanner;

public class previousTriesFive {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numOfRows = s.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = s.nextInt();
        String[][] seatArray = new String[numOfRows][seatsPerRow];
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seatArray[i][j] = "S";
            }
        }
        double currentIncome = 0;
        menu(numOfRows, seatsPerRow, seatArray, currentIncome);
    }


    public static void menu(int numOfRows, int seatsPerRow, String[][] seatArray, double currentIncome) {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");

        Scanner s = new Scanner(System.in);
        int operator = s.nextInt();

        int totalSeats = numOfRows * seatsPerRow;

        switch (operator) {
            case 0:
                break;
            case 1:
                printCinema(numOfRows, seatsPerRow, seatArray);
                menu(numOfRows, seatsPerRow, seatArray, currentIncome);
            case 2:
                buyTicket(totalSeats, numOfRows, seatsPerRow, seatArray);
                menu(numOfRows, seatsPerRow, seatArray, currentIncome);
            case 3:
                statInfo(seatsPerRow, numOfRows, seatArray, totalSeats, numOfRows, currentIncome);
                menu(numOfRows, seatsPerRow, seatArray, currentIncome);
            default:
                break;
        }
    }

    public static void printCinema(int numOfRows, int seatsPerRow, String[][] seatArray) {
        //  WRAP INTO A METHOD FOR PRINTING THE CINEMA
        System.out.println("Cinema:");
        System.out.print("  ");


        int[] topRow = new int[seatsPerRow];
        for (int i = 0; i < seatsPerRow; i++) {
            topRow[i] = i + 1;
            System.out.print(topRow[i] + " ");
        }

        System.out.println("");
        int[] firstCol = new int[numOfRows];
        for (int i = 0; i < numOfRows; i++) {
            firstCol[i] = 1 + i;
            System.out.print(firstCol[i] + " ");
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(seatArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void buyTicket(int totalSeats, int numOfRows, int seatsPerRow, String[][] seatArray) {
        // START TICKET PRICE SECTION NEW METHOD
        System.out.println("Enter a row number:");
        Scanner s = new Scanner(System.in);
        int rowNum = s.nextInt();
        System.out.println("Enter a seat number in that row:");
        int colNum = s.nextInt();

        while (rowNum < 0 || rowNum > numOfRows) {
            System.out.println("Wrong Input!");
            System.out.println("Enter a row number:");
            rowNum = s.nextInt();
            System.out.println("Enter a seat number in that row:");
            colNum = s.nextInt();
        }

        while (colNum < 0 || colNum > seatsPerRow) {
            System.out.println("Wrong Input!");
            System.out.println("Enter a row number:");
            rowNum = s.nextInt();
            System.out.println("Enter a seat number in that row:");
            colNum = s.nextInt();
        }

        while (seatArray[rowNum - 1][colNum - 1].equals("B")) {
            System.out.println("That ticket has already been purchased!");
            //System.out.println("Please choose a different seat");
            System.out.println("Enter a row number:");
            rowNum = s.nextInt();
            System.out.println("Enter a seat number in that row:");
            colNum = s.nextInt();
        }


        int ticketPrice = 10;
        if (totalSeats > 60) {
            if (rowNum > numOfRows / 2) {
                ticketPrice = 8;
            }
        }
        System.out.println("Ticket Price: $" + ticketPrice);

        seatArray[rowNum - 1][colNum - 1] = "B";
    }

    public static void statInfo(int seatsPerRow, int numOfRows, String[][] seatArray, int totalSeats, int rowNum, double currentIncome ){

        int ticketPrice = 10;
        if (totalSeats > 60) {
            if (rowNum > numOfRows / 2) {
                ticketPrice = 8;
            }
        }

        int numOfPurchasedTickets = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                if (seatArray[i][j] == "B") {
                    numOfPurchasedTickets++;
                    currentIncome += ticketPrice;
                }
            }
        }

        double percentPurchased = (double) numOfPurchasedTickets / totalSeats * 100;

        // NEW METHOD FOR SHOWING THE PROFIT
        System.out.println("Number of purchased tickets: " + numOfPurchasedTickets);
        System.out.println("");
        System.out.printf("Percentage: %.2f",percentPurchased);
        System.out.print("% \n");
        System.out.println("Current Income: $" + (int) currentIncome);


        if (totalSeats <= 60) {
            int smallRoomTicket = 10;
            int smallRoomTotal = totalSeats * smallRoomTicket;
            System.out.println("Total income: $" + smallRoomTotal);
        } else {
            int frontHalf = (int) Math.floor(numOfRows / 2);
            int backHalf = (int) Math.ceil(numOfRows / 2.0);

            int frontTotal = frontHalf * 10 * seatsPerRow;
            int backTotal = backHalf * 8 * seatsPerRow;

            int largeTotal = frontTotal + backTotal;
            System.out.println("Total income: $" + largeTotal);
        }
        // END TO BE DELETED SECTION OF PROFIT
    }
}
