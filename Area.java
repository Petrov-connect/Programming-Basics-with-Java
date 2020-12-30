import java.util.Scanner;

// created by J.M.
public class Area {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double lengh = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        double area = lengh * width;
        double perimeter = 2 * (lengh + width);

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);

    }
}
