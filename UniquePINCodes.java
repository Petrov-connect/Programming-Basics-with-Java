import java.util.Scanner;
// created by J.M.
public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1 = Integer.parseInt(scan.nextLine());
        int a2 = Integer.parseInt(scan.nextLine());
        int a3 = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= a1; i++) {
            for (int j = 2; j <= a2; j++) {
                for (int k = 1; k <= a3; k++) {
                    if ((i % 2 == 0 && k % 2 == 0) && ((j == 2 || j == 3 || j == 5 || j == 7) && j <= a2)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}

