import java.util.Scanner;

// created by J.M.
public class TransportPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int km = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        double price = 0.0;

        if (km < 20) {
            if (time.equals("day")) {
                price = 0.79 * km + 0.70;
            } else if (time.equals("night")) {
                price = 0.90 * km + 0.70;
            }
        } else if (km >= 100) {
            price = 0.06 * km;
        } else {
            price = km * 0.09;
        }
        System.out.printf("%.2f", price);
    }
}
