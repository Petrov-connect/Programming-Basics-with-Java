import java.util.Scanner;

// created by J.M.
public class Pets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int leftKg = Integer.parseInt(scan.nextLine());
        double dogFood = Double.parseDouble(scan.nextLine());
        double katFood = Double.parseDouble(scan.nextLine());
        double turtleFood = Double.parseDouble(scan.nextLine());

        double kgForAllDays = Math.ceil(dogFood * days + katFood * days + (turtleFood / 1000) * days);

        if (kgForAllDays <= leftKg) {
            double left = (leftKg - kgForAllDays);
            System.out.printf("%.0f kilos of food left.", left);
        } else {
            double left = (kgForAllDays - leftKg);
            System.out.printf("%.0f more kilos of food are needed.", left);
        }
    }
}
