import java.util.Scanner;

// created by J.M.
public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tax = Integer.parseInt(scan.nextLine());

        double sneakers = tax - tax * 0.4;
        double equip = sneakers - sneakers * 0.2;
        double boll = equip * (1 / 4.0);
        double accessories = boll * (1 / 5.0);

        double total = sneakers + equip + boll + accessories + tax;

        System.out.printf("%.2f", total);
    }
}
