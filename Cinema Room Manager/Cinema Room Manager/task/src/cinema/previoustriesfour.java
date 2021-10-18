package cinema;

import java.util.Scanner;

public class previoustriesfour {

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
        menu(numOfRows, seatsPerRow, seatArray);
    }


    public static void menu(int numOfRows, int seatsPerRow, String[][] seatArray) {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");

        Scanner s = new Scanner(System.in);
        int operator = s.nextInt();

        int totalSeats = numOfRows * seatsPerRow;

        switch (operator) {
            case 0:
                break;
            case 1:
                printCinema(numOfRows, seatsPerRow, seatArray);
                menu(numOfRows, seatsPerRow, seatArray);
            case 2:
                buyTicket(totalSeats, numOfRows, seatArray);
                menu(numOfRows, seatsPerRow, seatArray);
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

    public static void buyTicket(int totalSeats, int numOfRows, String[][] seatArray) {
        // START TICKET PRICE SECTION NEW METHOD
        System.out.println("Enter a row number:");
        Scanner s = new Scanner(System.in);
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

        seatArray[rowNum - 1][colNum - 1] = "B";
    }
}
