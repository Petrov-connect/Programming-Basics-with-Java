import java.util.Scanner;
// created by J.M.
public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceBrashno=Double.parseDouble(scan.nextLine());
        double brashno=Double.parseDouble(scan.nextLine());
        double zahar=Double.parseDouble(scan.nextLine());
        int koriEgg=Integer.parseInt(scan.nextLine());
        int maq=Integer.parseInt(scan.nextLine());

        double priceZahar=1.0*priceBrashno-priceBrashno*0.25;
        double priceKoreEgg=priceBrashno*1.1;
        double priceMaq=priceZahar-priceZahar*0.8;

        double price=brashno*priceBrashno+zahar*priceZahar+koriEgg*priceKoreEgg+maq*priceMaq;
        System.out.printf("%.2f",price);

    }
}
