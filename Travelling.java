import java.util.Scanner;

// created by J.M.
public class Travelling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();

        double budget;
        double money = 0;

        while (!destination.equals("End")) {
            budget = Double.parseDouble(scan.nextLine());
            while (money < budget) {
                money = Double.parseDouble(scan.nextLine());
                budget -= money;
                money = 0;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scan.nextLine();
        }
    }
}
