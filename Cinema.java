import java.util.Scanner;
// created by J.M.
public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double premiere =12.00;
        double normal = 7.50;
        double discount = 5.00;
        double income = 0.0;
        switch (projection) {
            case "Premiere":
                income = rows * columns * premiere;
                break;
            case "Normal":
                income = rows * columns * normal;
                break;
            case "Discount":
                income = rows * columns * discount;
                break;
        }
        System.out.printf("%.2f",income);
    }
}
