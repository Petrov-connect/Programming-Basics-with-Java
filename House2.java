import java.util.Scanner;

// created by J.M.
public class House2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int count = 1;
        String star = "*";
        String tire = "-";
        if (n % 2 == 0) {
            count = 2;
        }
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 1; j <= ((n + 1) / 2 - i); j++) {
                System.out.print(tire);
            }
            for (int m = 1; m <= count; m++) {
                System.out.print(star);
            }
            for (int j = 1; j <= ((n + 1) / 2 - i); j++) {
                System.out.print(tire);
            }
            System.out.println();
            count += 2;
        }
        count = (n - 2);
        for (int i = n / 2 - 1; i >= 0; i--) {
            System.out.print("|");
            for (int m = 1; m <= count; m++) {
                System.out.print(star);
            }
            System.out.println("|");
        }
    }
}