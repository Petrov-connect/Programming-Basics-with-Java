import java.util.Scanner;
// created by J.M.
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            double a = Math.floor(1.0 * i / 1000);
            double b = Math.floor(1.0 * i / 100);
            b = b % 10;
            double c = Math.floor(1.0 * i / 10);
            c = c % 10;
            double d = i % 10;
            if (a == 0 || b == 0 || c == 0 || d == 0) {
                continue;
            }  if ((a + b == c + d) &&  n % (a + b) == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}

