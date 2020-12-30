import java.util.Scanner;

// created by J.M.
public class EasterParty {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double guest = Integer.parseInt(scan.nextLine());
        double covert = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());

        if (guest >= 10 && guest <= 15) {
            covert = covert * 0.85;
        } else if (guest > 15 && guest <= 20) {
            covert = covert * 0.8;
        } else if (guest > 20) {
            covert = covert * 0.75;
        }
        double cake = budget * 0.1;
        double total = (guest * covert) + cake;
        if (total <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }
    }
}
