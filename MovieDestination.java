import java.util.Scanner;

// created by J.M.
public class MovieDestination {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (destination) {
            case "Dubai":
                price = season.equals("Winter") ? 45000 : 40000;
                price *= 0.7;
                break;
            case "Sofia":
                price = season.equals("Winter") ? 17000 : 12500;
                price *= 1.25;
                break;
            case "London":
                price = season.equals("Winter") ? 24000 : 20250;
                break;
        }
        if (price * days <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - (price * days));
        } else {
            System.out.printf("The director needs %.2f leva more!", (price * days) - budget);
        }
    }
}
