import java.util.Scanner;

// created by J.M.
public class TennisEquipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceR = Double.parseDouble(scan.nextLine());
        int r = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        double priseM = priceR * (1 / 6.0);
        double total = r * priceR + m * priseM;
        total = total + total * 0.2;
        double total1 = Math.floor(total * (1 / 8.0));
        double total2 = Math.ceil(total * (7 / 8.0));

        System.out.printf("Price to be paid by Djokovic %.0f%n", total1);
        System.out.printf("Price to be paid by sponsors %.0f", total2);
    }
}
