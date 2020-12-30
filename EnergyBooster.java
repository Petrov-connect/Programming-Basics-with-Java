import java.util.Scanner;

// created by J.M.
public class EnergyBooster {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String size = scan.nextLine();
        int set = Integer.parseInt(scan.nextLine());

        double price = 0;
        double totalPrice;
        switch (fruit) {
            case "Watermelon":
                price = size.equals("small") ? 56.00 : 28.70;
                break;
            case "Mango":
                price = size.equals("small") ? 36.66 : 19.60;
                break;
            case "Pineapple":
                price = size.equals("small") ? 42.10 : 24.80;
                break;
            case "Raspberry":
                price = size.equals("small") ? 20.00 : 15.20;
                break;
        }

        if (size.equals("small")) {
            totalPrice = price * 2 * set;
        } else {
            totalPrice = price * 5 * set;
        }
        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice *= 0.85;
        } else if (totalPrice > 1000) {
            totalPrice *= 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
