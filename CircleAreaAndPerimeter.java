import java.util.Scanner;
// created by J.M.
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI*r*r;
        double perimeter = Math.PI*2*r;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",perimeter);
    }
}
