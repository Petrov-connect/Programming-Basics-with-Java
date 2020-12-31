import java.util.Scanner;

// created by J.M.
public class SummerShopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double towel = Double.parseDouble(scan.nextLine());
        double proc = Double.parseDouble(scan.nextLine());

        double umbrella = towel * (1.0 * 2 / 3);
        double flipFlops = umbrella * 0.75;
        double bag = (towel + flipFlops) * (1.0 * 1 / 3);
        double sum = (bag + flipFlops + umbrella + towel);
        double total = sum - sum * proc / 100;

        if (budget >= total) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", total, budget - total);
        } else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", total, total - budget);
        }
    }
}
