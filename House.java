import java.util.Scanner;

// created by J.M.
public class House {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int count = 1;
        if (n % 2 == 0) {
            count = 2;
        }
        for (int i = 1; i <= (n + 1) / 2; i++) {
            String tire = "-".repeat((n + 1) / 2 - i);
            String star = "*".repeat(count);
            System.out.println(tire + star + tire);
            count += 2;
        }
        count = (n - 2);
        for (int i = n / 2 - 1; i >= 0; i--) {
            String star = "*".repeat(count);
            System.out.println("|" + star + "|");
        }
    }
}

