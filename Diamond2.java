import java.util.Scanner;

// created by J.M.
public class Diamond2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int a, b;
        String star;
        String tire = "-";
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
            for (int i = 1; i <= ((n - 1) / 2); i++) {
                System.out.print(tire);
            }
            System.out.print(star);
            for (int i = 1; i <= ((n - 1) / 2); i++) {
                System.out.print(tire);
            }
            System.out.println();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= (((n - 1) / 2) - i); j++) {
                    System.out.print(tire);
                }
                System.out.print("*");
                for (int j = 1; j <= (n - 2 * (((n - 1) / 2) - i) - 2); j++) {
                    System.out.print(tire);
                }
                System.out.print("*");
                for (int j = 1; j <= (((n - 1) / 2) - i); j++) {
                    System.out.print(tire);
                }
                System.out.println();
            }
            for (int i = b; i >= 1; i--) {
                for (int j = 1; j <= (((n - 1) / 2) - i); j++) {
                    System.out.print(tire);
                }
                System.out.print("*");
                for (int j = 1; j <= (n - 2 * (((n - 1) / 2) - i) - 2); j++) {
                    System.out.print(tire);
                }
                System.out.print("*");
                for (int j = 1; j <= (((n - 1) / 2) - i); j++) {
                    System.out.print(tire);
                }
                System.out.println();
            }
            for (int i = 1; i <= ((n - 1) / 2); i++) {
                System.out.print(tire);
            }
            System.out.print(star);
            for (int i = 1; i <= ((n - 1) / 2); i++) {
                System.out.print(tire);
            }
        }
    }
}

