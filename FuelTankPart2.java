import java.util.Scanner;

// created by J.M.
public class FuelTankPart2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fuel = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double price = 0.0;

        if (fuel.equals("Gasoline")) {
            price = 2.22;
            if (card.equals("Yes")) {
                price -= 0.18;
            }
        }
        if (fuel.equals("Diesel")) {
            price = 2.33;
            if (card.equals("Yes")) {
                price -= 0.12;
            }
        }
        if (fuel.equals("Gas")) {
            price = 0.93;
            if (card.equals("Yes")) {
                price -= 0.08;
            }
        }
        double totalPrice = quantity * price;

        if (quantity > 25) {
            totalPrice *= 0.9;
        } else if (quantity >= 20 && quantity <= 25) {
            totalPrice *= 0.92;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
