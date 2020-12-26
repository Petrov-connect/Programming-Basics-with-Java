import java.util.Scanner;
// created by J.M.
public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kindOfFuel = scan.nextLine();
        double litersOfFuel = Double.parseDouble(scan.nextLine());
        kindOfFuel = kindOfFuel.toLowerCase();
        if (kindOfFuel.equals("diesel") || kindOfFuel.equals("gasoline") || kindOfFuel.equals("gas")) {
            if (litersOfFuel >= 25) {
                System.out.printf("You have enough %s.", kindOfFuel);
            } else if (litersOfFuel < 25) {
                System.out.printf("Fill your tank with %s!", kindOfFuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
