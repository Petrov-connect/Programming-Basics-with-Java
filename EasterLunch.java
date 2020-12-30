import java.util.Scanner;

// created by J.M.
public class EasterLunch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int easterBreads = Integer.parseInt(scan.nextLine());
        int pieCrusts = Integer.parseInt(scan.nextLine());
        int cookies = Integer.parseInt(scan.nextLine());

        double priceEasterBread = 3.20;
        double priceCookies = 5.40;
        double pricePieCrust = 4.35;
        double decoration = 12 * 0.15;
        double totalPrice = priceEasterBread * easterBreads + pieCrusts * pricePieCrust + pieCrusts * decoration + cookies * priceCookies;

        System.out.printf("%.2f", totalPrice);
    }
}
