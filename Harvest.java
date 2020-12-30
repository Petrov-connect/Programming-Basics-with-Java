import java.util.Scanner;

// created by J.M.
public class Harvest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());

        double liters = (((x * y) * 0.4) / 2.5);
        if (liters >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(liters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(liters - z), Math.ceil((liters - z) / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - liters));

        }
    }
}
