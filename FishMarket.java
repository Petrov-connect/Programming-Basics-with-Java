import java.util.Scanner;

// created by J.M.
public class FishMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mackerel = Double.parseDouble(scan.nextLine());
        double toy = Double.parseDouble(scan.nextLine());
        double bonito = Double.parseDouble(scan.nextLine());
        double scad = Double.parseDouble(scan.nextLine());
        double mussels = Double.parseDouble(scan.nextLine());

        double total = ((mackerel + (mackerel * 0.6)) * bonito) + ((toy + (toy * 0.8)) * scad) + (mussels * 7.50);

        System.out.printf("%.2f", total);
    }
}

