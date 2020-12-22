import java.util.Scanner;
// created by J.M.
public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double proc = Double.parseDouble(scan.nextLine())*0.01;
        double obem = (a * b * c) * 0.001;
        double liters= obem * (1 - proc);
        System.out.printf( "%.3f ", liters );

    }

}
