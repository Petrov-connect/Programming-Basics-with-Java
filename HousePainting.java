import java.util.Scanner;

// created by J.M.
public class HousePainting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double green = (((x * x * 2) - (1.2 * 2)) + ((x * y * 2) - (1.5 * 1.5 * 2))) / 3.4;
        double red = ((x * y * 2) + (x * h)) / 4.3;

        System.out.printf("%.2f%n", green);
        System.out.printf("%.2f", red);
    }
}
