import java.util.Scanner;

// created by J.M.
public class TheSongOfTheWheels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int M = Integer.parseInt(scan.nextLine());

        int count = 0;
        boolean x = false;
        String last4 = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i < j && k > l) && (i * j + k * l) == M) {
                            count++;
                            if (count == 4) {
                                last4 = String.format("%d%d%d%d", i, j, k, l);
                                x = true;
                            }
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
        System.out.println();
        if (x) {
            System.out.printf("Password: %s", last4);
        } else {
            System.out.println("No!");
        }
    }
}
