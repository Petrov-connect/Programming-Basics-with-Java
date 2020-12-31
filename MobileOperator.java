import java.util.Scanner;

// created by J.M.
public class MobileOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String period = scan.nextLine();
        String contract = scan.nextLine();
        String net = scan.nextLine();
        int mont = Integer.parseInt(scan.nextLine());

        double price = 0;
        switch (contract) {
            case "Small":
                price = (period.equals("one")) ? 9.98 : 8.58;
                break;
            case "Middle":
                price = (period.equals("one")) ? 18.99 : 17.09;
                break;
            case "Large":
                price = (period.equals("one")) ? 25.98 : 23.59;
                break;
            case "ExtraLarge":
                price = (period.equals("one")) ? 35.99 : 31.79;
                break;
        }
        if (price <= 10 && net.equals("yes")) {
            price += 5.50;
        } else if (price <= 30 && net.equals("yes")) {
            price += 4.35;
        } else if (price > 30 && net.equals("yes")) {
            price += 3.85;
        }
        double total = mont * price;
        if (period.equals("two")) {
            total *= 0.9625;
        }
        System.out.printf("%.2f lv.", total);
    }
}
