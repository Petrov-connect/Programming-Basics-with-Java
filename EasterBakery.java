import java.util.Scanner;

// created by J.M.
public class EasterBakery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceFlour = Double.parseDouble(scan.nextLine());
        double flour = Double.parseDouble(scan.nextLine());
        double sugar = Double.parseDouble(scan.nextLine());
        int boxEgg = Integer.parseInt(scan.nextLine());
        int yeast = Integer.parseInt(scan.nextLine());

        double priceSugar = priceFlour - priceFlour * 0.25;
        double priceBoxEgg = priceFlour * 1.1;
        double priceYeast = priceSugar - priceSugar * 0.8;
        double price = flour * priceFlour + sugar * priceSugar + boxEgg * priceBoxEgg + yeast * priceYeast;

        System.out.printf("%.2f", price);

    }
}
