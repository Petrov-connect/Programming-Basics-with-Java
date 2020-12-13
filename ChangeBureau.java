import java.util.Scanner;
// created by J.M.
public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bitc = Integer.parseInt(scan.nextLine());
        double yoan = Double.parseDouble(scan.nextLine());
        double commission= Double.parseDouble(scan.nextLine());
        double sum= ((bitc*1168)+(yoan*0.15*1.76))/1.95;
        double totalSum = sum-(sum*commission/100);
        System.out.printf("%.2f",totalSum);
    }
}
