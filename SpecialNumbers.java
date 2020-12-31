import java.util.Scanner;

// created by J.M.
public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (int i = 1111; i <= 9999; i++) {
            for (int j = 0; j <= 3; j++) {
                int num = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));
                if (num == 0) {
                    break;
                } else if (n % num == 0) {
                    count++;
                }
            }
            if (count == 4) {
                System.out.printf("%d ", i);
            }
            count = 0;
        }
    }
}
