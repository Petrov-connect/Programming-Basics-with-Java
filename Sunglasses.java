import java.util.Scanner;
// created by J.M.
public class Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String star = "*";
        String space = " ";
        String naklon = "/";
        String line = "|";
        for (int i = 1; i <= n * 2; i++) {
            System.out.print(star);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(space);
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print(star);
        }
        System.out.println();
        for (int i = 0; i <= n - 3; i++) {
            System.out.print("*");
            if (i == (n - 1) / 2 - 1) {
                for (int j = 1; j <= 2 * n - 2; j++) {
                    System.out.print(naklon);
                }
                System.out.print("*");
                for (int k = 1; k <= n; k++) {
                    System.out.print(line);
                }
                System.out.print("*");
                for (int a = 1; a <= 2 * n - 2; a++) {
                    System.out.print(naklon);
                }
            } else {
                for (int b = 1; b <= 2 * n - 2; b++) {
                    System.out.print(naklon);
                }
                System.out.print("*");
                for (int m = 1; m <= n; m++) {
                    System.out.print(space);
                }
                System.out.print("*");
                for (int l = 1; l <= 2 * n - 2; l++) {
                    System.out.print(naklon);
                }
            }
            System.out.println("*");
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print(star);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(space);
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print(star);
        }
    }
}
