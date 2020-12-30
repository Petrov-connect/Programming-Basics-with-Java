import java.util.Scanner;

// created by J.M.
public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int bigger = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            sum = sum + a;
            if (a > bigger) {
                bigger = a;
            }
        }
        if (1.0 * sum / 2 == bigger) {
            System.out.println("Yes");
            System.out.println("Sum = " + bigger);
        } else {
            System.out.println("No");
            int diff = Math.abs(bigger - (sum - bigger));
            System.out.println("Diff = " + diff);
        }
    }
}
