import java.util.Scanner;

// created by J.M.
public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("%d", max);
    }
}
