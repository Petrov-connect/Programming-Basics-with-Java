import java.util.Scanner;
// created by J.M.
public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int table = Integer.parseInt(scan.nextLine());
        double lengh = Double.parseDouble(scan.nextLine());
        double wingh = Double.parseDouble(scan.nextLine());
        double tablecloth = table * (lengh + 2 * 0.3) * (wingh + 2 * 0.3);
        double quads = table * (lengh / 2) * (lengh / 2);
        double priceUsd = (tablecloth * 7) + (quads * 9);
        double priceBgn = priceUsd * 1.85;
        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);


    }
}
