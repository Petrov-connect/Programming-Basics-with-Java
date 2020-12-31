import java.util.Scanner;

// created by J.M.
public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pen = Integer.parseInt(scan.nextLine());
        int marker = Integer.parseInt(scan.nextLine());
        double drug = Double.parseDouble(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());

        double sum = (pen * 5.80) + (marker * 7.20) + (drug * 1.20);
        double totalSum = sum - (sum * discount / 100);

        System.out.printf("%.3f", totalSum);
    }
}
