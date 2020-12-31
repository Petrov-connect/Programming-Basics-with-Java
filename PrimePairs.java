import java.util.Scanner;

// created by J.M.
public class PrimePairs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int a1 = Integer.parseInt(scan.nextLine());
        int b1 = Integer.parseInt(scan.nextLine());

        boolean Aa = true;
        boolean Bb = true;

        for (int i = a; i <= a + a1; i++) {
            for (int j = b; j <= b + b1; j++) {
                for (int k = 2; k <= i - 1; k++) {
                    if ((i % k == 0)) {
                        Aa = false;
                        break;
                    }
                }
                for (int m = 2; m <= j - 1; m++) {
                    if ((j % m == 0)) {
                        Bb = false;
                        break;
                    }
                }
                if (Aa && Bb) {
                    System.out.printf("%d%d%n", i, j);
                }
                Aa = true;
                Bb = true;
            }
        }
    }
}

