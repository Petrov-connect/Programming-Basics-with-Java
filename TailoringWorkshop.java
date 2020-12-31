import java.util.Scanner;

// created by J.M.
public class TailoringWorkshop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int table = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        double tablecloth = table * (length + 2 * 0.3) * (width + 2 * 0.3);
        double quads = table * (length / 2) * (length / 2);
        double priceUsd = (tablecloth * 7) + (quads * 9);
        double priceBgn = priceUsd * 1.85;

        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceBgn);


    }
}
