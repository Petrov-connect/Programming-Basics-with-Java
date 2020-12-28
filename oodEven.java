import java.util.Scanner;
// created by J.M.
public class oodEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean x = true;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("NonPrime" + n);
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("Prime" + n);
        }
    }
}

