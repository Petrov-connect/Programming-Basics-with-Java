import java.util.Scanner;
// created by J.M.
public class FuelTank3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fuel = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();
        double gas = 0.93;
        double gasoline = 2.22;
        double diesel = 2.33;
        double totalPrice = 0.0;
        if (card.equals("Yes")) {
            gas -= 0.08;
            gasoline -= 0.18;
            diesel -= 0.12;
        }
        switch (fuel) {
            case "Gasoline":
                totalPrice = quantity * gasoline;
                break;
            case "Diesel":
                totalPrice = quantity * diesel;
                break;
            case "Gas":
                totalPrice = quantity * gas;
                break;
        }
        if (quantity > 25) {
            totalPrice *= 0.9;
        } else if (quantity >= 20 && quantity <= 25) {
            totalPrice *= 0.92;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}