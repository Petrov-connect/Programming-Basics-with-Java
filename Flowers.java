import java.util.Scanner;

// created by J.M.
public class Flowers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        char tip = scan.nextLine().charAt(0);

        double chrPrice = 0;
        double rosPrice = 0;
        double tulPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrPrice = tip == ('Y') ? 2.0 * 1.15 : 2.0;
                rosPrice = tip == ('Y') ? 4.1 * 1.15 : 4.1;
                tulPrice = tip == ('Y') ? 2.5 * 1.15 : 2.5;
                break;
            case "Autumn":
            case "Winter":
                chrPrice = tip == ('Y') ? 3.75 * 1.15 : 3.75;
                rosPrice = tip == ('Y') ? 4.50 * 1.15 : 4.50;
                tulPrice = tip == ('Y') ? 4.15 * 1.15 : 4.15;
                break;
        }
        double price = (chrysanthemums * chrPrice) + (roses * rosPrice) + (tulips * tulPrice);


        if (tulips > 7 && season.equals("Spring")) {
            price *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            price *= 0.9;
        }
        if (chrysanthemums + roses + tulips > 20) {
            price *= 0.80;
        }
        System.out.printf("%.2f", price + 2);
    }
}
