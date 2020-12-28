import java.util.Scanner;
// created by J.M.

public class AccountBalance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(scan.nextLine());
            if (input < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", input);
                sum += input;
            }
        }
        System.out.printf("Total: %.2f", sum);
    }
}
