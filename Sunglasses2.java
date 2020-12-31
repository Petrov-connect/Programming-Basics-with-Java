import java.util.Scanner;

// created by J.M.
public class Sunglasses2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String star = "*".repeat(n * 2);
        String space = " ".repeat(n);
        System.out.println(star + space + star);

        for (int i = 0; i <= n - 3; i++) {
            String naklon = "/".repeat(2 * n - 2);
            String line = "|".repeat(n);
            if (i == (n - 1) / 2 - 1) {
                System.out.println("*" + naklon + "*" + line + "*" + naklon + "*");
            } else {
                System.out.println("*" + naklon + "*" + space + "*" + naklon + "*");
            }
        }
        System.out.println(star + space + star);
    }
}

