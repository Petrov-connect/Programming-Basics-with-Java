import java.util.Scanner;
// created by J.M.

public class AlcoholMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceOfWhiskey = Double.parseDouble(scan.nextLine());
        double litersOfBeer = Double.parseDouble(scan.nextLine());
        double litersOfWine = Double.parseDouble(scan.nextLine());
        double litersOfRakia = Double.parseDouble(scan.nextLine());
        double litersOfWhiskey = Double.parseDouble(scan.nextLine());
        double priceOfRakia = 0.5 * priceOfWhiskey;
        double priceOfWine = 0.6 * priceOfRakia;
        double priceOfBeer = 0.2 * priceOfRakia;
        double totalPriceOfWhiskey = litersOfWhiskey * priceOfWhiskey;
        double totalPriceOfRakia = litersOfRakia * priceOfRakia;
        double totalPriceOfWine = litersOfWine * priceOfWine;
        double totalPriceOfBeer = litersOfBeer * priceOfBeer;

        double totalSum = totalPriceOfWhiskey + totalPriceOfRakia + totalPriceOfWine + totalPriceOfBeer;
        System.out.printf("%.2f", totalSum);

    }
}
