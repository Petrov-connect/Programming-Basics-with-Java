import java.util.Scanner;
// created by J.M.
public class RhombusOfStars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            String space = " ".repeat(n - i);
            String next = "* ".repeat(i );
            System.out.println(space+next);
        }
        for (int j = n-1; j >= 1; j--) {
            String space=" ".repeat(n-j);
            String next = "* ".repeat(j);
            System.out.println(space+next);
        }
    }
}

