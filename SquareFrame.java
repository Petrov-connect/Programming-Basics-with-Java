import java.util.Scanner;

// created by J.M.
public class SquareFrame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String plus = "+";
        String minus = " -";
        String space = " ";

        System.out.print(plus);
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(minus);
        }
        System.out.print(space);
        System.out.println(plus);
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(minus);
            }
            System.out.print(space);
            System.out.println("|");
        }

        System.out.print(plus);
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(minus);
        }
        System.out.print(space);
        System.out.print(plus);
    }
}