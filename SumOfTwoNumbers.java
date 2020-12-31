import java.util.Scanner;

// created by J.M.
public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());

        int sum;
        int count = 0;
        int i, j;

        for (i = a; i <= b; i++) {
            for (j = a; j <= b; j++) {
                sum = i + j;
                count++;
                if (sum == num) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, num);
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                break;
            }
        }
        if (i > 0) {
            System.out.printf("%d combinations - neither equals %d", count, num);
        }
    }
}
