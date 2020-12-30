import java.util.Scanner;

// created by J.M.
public class FishTank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine()) * 0.01;

        double bulk = (a * b * c) * 0.001;
        double liters = bulk * (1 - percent);

        System.out.printf("%.3f ", liters);

    }

}
