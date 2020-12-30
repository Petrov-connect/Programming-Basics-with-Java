import java.util.Scanner;

// created by J.M.
public class Diamond {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int a, b;
        String star;
        String tire;
        String mid;
        if (n == 1) {
            star = "*";
            System.out.println(star);
        } else if (n == 2) {
            star = "**";
            System.out.println(star);
        } else {
            if (n % 2 == 0) {
                a = n / 2 - 1;
                b = n / 2 - 2;
                star = "**";
            } else {
                a = n / 2;
                b = n / 2 - 1;
                star = "*";
            }
            tire = "-".repeat((n - 1) / 2);
            System.out.println(tire + star + tire);
            for (int i = 1; i <= a; i++) {
                mid = "-".repeat(n - 2 * (((n - 1) / 2) - i) - 2);
                tire = "-".repeat(((n - 1) / 2) - i);
                System.out.println(tire + "*" + mid + "*" + tire);
            }
            for (int i = b; i >= 1; i--) {
                mid = "-".repeat(n - 2 * (((n - 1) / 2) - i) - 2);
                tire = "-".repeat(((n - 1) / 2) - i);
                System.out.println(tire + "*" + mid + "*" + tire);
            }
            tire = "-".repeat((n - 1) / 2);
            System.out.println(tire + star + tire);
        }
    }
}
