import java.util.Scanner;

// created by J.M.
public class FitnessCard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine());
        char gender = scan.nextLine().charAt(0);
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

        double price = 0.0;

        switch (sport) {
            case "Gym":
                price = (gender == ('m')) ? 42.0 : 35.0;
                break;
            case "Boxing":
                price = (gender == ('m')) ? 41.0 : 37.0;
                break;
            case "Yoga":
                price = (gender == ('m')) ? 45.0 : 42.0;
                break;
            case "Zumba":
                price = (gender == ('m')) ? 34.0 : 31.0;
                break;
            case "Dances":
                price = (gender == ('m')) ? 51.0 : 53.0;
                break;
            case "Pilates":
                price = (gender == ('m')) ? 39.0 : 37.0;
                break;
        }
        if (age <= 19) {
            price *= 0.8;
        }
        if (sum >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - sum);
        }
    }
}
