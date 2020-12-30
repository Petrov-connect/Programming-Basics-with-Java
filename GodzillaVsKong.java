import java.util.Scanner;

// created by J.M.
public class GodzillaVsKong {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int actors = Integer.parseInt(scan.nextLine());
        double priceCostum = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.1;
        if (actors > 150) {
            priceCostum *= 0.9;
        }
        double total = (priceCostum * actors) + decor;
        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
