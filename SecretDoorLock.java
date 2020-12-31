import java.util.Scanner;

// created by J.M.
public class SecretDoorLock {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a1 = Integer.parseInt(scan.nextLine());
        int a2 = Integer.parseInt(scan.nextLine());
        int a3 = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= a1; i += 2) {
            for (int j = 2; j <= a2; j++) {
                for (int k = 2; k <= a3; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
