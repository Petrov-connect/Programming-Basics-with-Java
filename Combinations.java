import java.util.Scanner;

// created by J.M.
public class Combinations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int i, j, m;
        int sum;
        int count = 0;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                for (m = 0; m <= n; m++) {
                    sum = i + j + m;
                    if (sum == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
