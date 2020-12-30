import java.util.Scanner;

// created by J.M.
public class EasterBake {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        double totalZ = 0;
        double totalB = 0;
        int b;
        int z;
        int maxZ = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        for (int i = 1; i <= num; i++) {
            z = Integer.parseInt(scan.nextLine());
            b = Integer.parseInt(scan.nextLine());
            totalZ += z;
            totalB += b;
            if (maxZ < z) {
                maxZ = z;
            }
            if (maxB < b) {
                maxB = b;
            }
        }
        totalZ = Math.ceil(totalZ / 950);
        totalB = Math.ceil(totalB / 750);

        System.out.printf("Sugar: %.0f%n", totalZ);
        System.out.printf("Flour: %.0f%n", totalB);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxB, maxZ);
    }
}
