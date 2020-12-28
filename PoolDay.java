import java.util.Scanner;
// created by J.M.
public class PoolDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people=Integer.parseInt(scan.nextLine());
        double tax=Double.parseDouble(scan.nextLine());
        double priceSH=Double.parseDouble(scan.nextLine());
        double priceUM=Double.parseDouble(scan.nextLine());
        double sh=Math.ceil(people*0.75);
        double um=Math.ceil(people/2.0);
        double total=people*tax+sh*priceSH+um*priceUM;
        System.out.printf("%.2f lv.",total);
    }
}
