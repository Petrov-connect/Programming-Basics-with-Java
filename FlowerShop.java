import java.util.Scanner;

// created by J.M.
public class FlowerShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int r = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
        double gift = Double.parseDouble(scan.nextLine());

        double profit = (m * 3.25 + z * 4 + r * 3.50 + k * 8) * 0.95;
        if (profit >= gift) {
            double left = Math.floor(profit - gift);
            System.out.printf("She is left with %.0f leva.", left);
        } else {
            double left = Math.ceil(gift - profit);
            System.out.printf("She will have to borrow %.0f leva.", left);
        }
    }
}
