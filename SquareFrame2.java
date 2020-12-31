import java.util.Scanner;

// created by J.M.
public class SquareFrame2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String plus = "+";
        String minus = " -".repeat(n - 2);
        String space = " ";

        System.out.println(plus + minus + space + plus);
        for (int i = 0; i < n - 2; i++) {
            System.out.print("|");
            System.out.print(minus);
            System.out.print(space);
            System.out.println("|");
        }
        System.out.println(plus + minus + space + plus);
    }
}