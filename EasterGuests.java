import java.util.Scanner;

// created by J.M.
public class EasterGuests {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int guest = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        double numberOfEasterBread = Math.ceil(guest / 3.0);
        int eggs = guest * 2;
        double price = eggs * 0.45 + numberOfEasterBread * 4.0;
        if (price <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", numberOfEasterBread, eggs);
            System.out.printf("He has %.2f lv. left.", budget - price);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", price - budget);
        }
    }
}

