import java.util.Scanner;

// created by J.M.
public class Repainting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double totalPaint = paint + paint * 0.1;
        double totalNylon = nylon + 2.0;
        double sum = totalPaint * 14.50 + totalNylon * 1.50 + thinner * 5.00 + 0.40;
        double workSum = sum * 0.3 * hours;
        double totalSum = sum + workSum;

        System.out.printf("Total expenses: %.2f lv.", totalSum);
    }
}
