import java.util.Scanner;
// created by J.M.

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
        }
        System.out.printf("%.2f", sum / n);

    }
}
