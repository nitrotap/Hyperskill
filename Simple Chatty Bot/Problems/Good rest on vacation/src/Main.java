import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here 
        int duration = scanner.nextInt();
        int foodperday = scanner.nextInt();
        int oneflight = scanner.nextInt();
        int hotelcost = scanner.nextInt();
        
        // foodtotal; flighttotal; hoteltotal
        
        int foodTotal = foodperday * duration;
        int flightTotal = oneflight * 2;
        int hotelTotal = --duration * hotelcost;
        int finalTotal = foodTotal + flightTotal + hotelTotal;
        
        System.out.println(finalTotal);        
    }
}