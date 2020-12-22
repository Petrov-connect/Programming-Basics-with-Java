import java.util.Scanner;
// created by J.M.
public class FishMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double skum = Double.parseDouble(scan.nextLine());
        double caca = Double.parseDouble(scan.nextLine());
        double palam = Double.parseDouble(scan.nextLine());
        double safr = Double.parseDouble(scan.nextLine());
        double mussels = Double.parseDouble(scan.nextLine());
        double total = ((skum+(skum*0.6))*palam)+((caca+(caca*0.8))*safr)+(mussels*7.50);
        System.out.printf("%.2f",total);
    }
}
