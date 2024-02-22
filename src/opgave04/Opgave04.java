package opgave04;

import opgave04.models.TheaterFloor;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Do you want a certain seat? (write 'seat') Or a seat with a certain price? (write 'price')");
        String answer = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        if(answer.equals("seat")) {
            System.out.println("Write the seat row and number (minus one with each)");
            int row = scanner2.nextInt();
            int seat = scanner2.nextInt();
            theaterFloor.buySeat(row, seat);
        }
        else if(answer.equals("price")) {
            System.out.println("Write the price you want");
            int price = scanner2.nextInt();
            System.out.println(theaterFloor.buySeat(price));
        }
        else {
            System.out.println("Your answer is invalid");
        }
        scanner1.close();
        scanner2.close();

        theaterFloor.buySeat(4, 4);
        theaterFloor.buySeat(50);
        theaterFloor.printTheaterFloor();
    }
}
