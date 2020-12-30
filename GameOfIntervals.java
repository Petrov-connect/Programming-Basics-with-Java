import java.util.Scanner;

// created by J.M.
public class GameOfIntervals {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double points = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (num >= 0 && num <= 9) {
                a2++;
                points += (num * 0.2);
            } else if (num >= 10 && num <= 19) {
                a3++;
                points += (num * 0.3);
            } else if (num >= 20 && num <= 29) {
                a4++;
                points += (num * 0.4);
            } else if (num >= 30 && num <= 39) {
                a5++;
                points += 50;
            } else if (num >= 40 && num <= 50) {
                a6++;
                points += 100;
            } else {
                a7++;
                points /= 2;
            }
        }
        double proca2 = 1.0 * a2 / n * 100;
        double proca3 = 1.0 * a3 / n * 100;
        double proca4 = 1.0 * a4 / n * 100;
        double proca5 = 1.0 * a5 / n * 100;
        double proca6 = 1.0 * a6 / n * 100;
        double proca7 = 1.0 * a7 / n * 100;

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", proca2);
        System.out.printf("From 10 to 19: %.2f%%%n", proca3);
        System.out.printf("From 20 to 29: %.2f%%%n", proca4);
        System.out.printf("From 30 to 39: %.2f%%%n", proca5);
        System.out.printf("From 40 to 50: %.2f%%%n", proca6);
        System.out.printf("Invalid numbers: %.2f%%", proca7);
    }
}
