import java.util.Scanner;

// created by J.M.
public class MovieProfit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int countDays = Integer.parseInt(scan.nextLine());
        int countTicket = Integer.parseInt(scan.nextLine());
        double priceTicket = Double.parseDouble(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double total = countTicket * priceTicket * countDays;
        total -= total * percent / 100;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, total);
    }
}
