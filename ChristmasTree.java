import java.util.Scanner;

// created by J.M.
public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String space = " ";
        String l = " | ";
        String star = "*";
        for (int i = 1; i <= n; i++) {
            System.out.print(space);
        }
        System.out.println(l);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(star);
            }
            System.out.print(l);
            for (int m = 1; m <= i; m++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
