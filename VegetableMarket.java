import java.util.Scanner;
// created by J.M.
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfVege = Double.parseDouble(scan.nextLine());
        double priceOfFruit = Double.parseDouble(scan.nextLine());
        double totalOfVege = Double.parseDouble(scan.nextLine());
        double totalOfFruit = Double.parseDouble(scan.nextLine());
        double totalPrice = (totalOfVege * priceOfVege) + (totalOfFruit * priceOfFruit);
        System.out.printf("%.2f", totalPrice/1.94);

    }
}
