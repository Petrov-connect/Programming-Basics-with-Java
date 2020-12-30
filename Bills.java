import java.util.Scanner;

// created by J.M.
public class Bills {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());

        double totalEnergy = 0;
        double totalWater = 0;
        double totalInternet = 0;
        double totalOder = 0;
        for (int i = 1; i <= months; i++) {
            double price = Double.parseDouble(scan.nextLine());
            totalEnergy += price;
            totalWater += 20.0;
            totalInternet += 15.0;
            totalOder += ((20 + 15 + price) * 1.2);
        }
        double totalPrice = (totalEnergy + totalWater + totalInternet + totalOder) / months;

        System.out.printf("Electricity: %.2f lv%n", totalEnergy);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", totalOder);
        System.out.printf("Average: %.2f lv", totalPrice);
    }
}

