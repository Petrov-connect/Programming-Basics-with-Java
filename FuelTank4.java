import java.util.Scanner;

// created by J.M.
class FuelTank4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int fuelQty = Integer.parseInt(scanner.nextLine());
        String discountCard = scanner.nextLine();

        double fuelPrice = 0;

        switch (fuelType) {
            case "Gas":
                fuelPrice = discountCard.equals("Yes") ? 0.93 - 0.08 : 0.93;
                break;
            case "Gasoline":
                fuelPrice = discountCard.equals("Yes") ? 2.22 - 0.18 : 2.22;
                break;
            case "Diesel":
                fuelPrice = discountCard.equals("Yes") ? 2.33 - 0.12 : 2.33;
                break;
        }
        if (fuelQty > 25) {
            fuelPrice *= 0.9;
        } else if (fuelQty >= 20) {
            fuelPrice *= 0.92;
        }
        double result = fuelQty * fuelPrice;

        System.out.printf("%.2f lv.", result);
    }
}