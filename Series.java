import java.util.Scanner;

// created by J.M.
public class Series {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= n; i++) {
            String name = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            switch (name) {
                case "Thrones":
                    price *= 0.5;
                    break;
                case "Lucifer":
                    price *= 0.6;
                    break;
                case "Protector":
                    price *= 0.70;
                    break;
                case "TotalDrama":
                    price *= 0.80;
                    break;
                case "Area":
                    price *= 0.9;
                    break;
            }
            totalPrice += price;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
