import java.util.Scanner;

// created by J.M.
public class FruitShop2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0.0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana": price = day.equals("Saturday") || day.equals("Sunday") ? 2.7 : 2.5;      break;
                case "apple": price = day.equals("Saturday") || day.equals("Sunday") ? 1.25 : 1.2;      break;
                case "orange": price = day.equals("Saturday") || day.equals("Sunday") ? 0.9 : 0.85;     break;
                case "grapefruit": price = day.equals("Saturday") || day.equals("Sunday") ? 1.6 : 1.45; break;
                case "kiwi": price = day.equals("Saturday") || day.equals("Sunday") ? 3.0 : 2.7;        break;
                case "pineapple": price = day.equals("Saturday") || day.equals("Sunday") ? 5.6 : 5.5;   break;
                case "grapes": price = day.equals("Saturday") || day.equals("Sunday") ? 4.2 : 3.85;     break;
            }
        }  if (price > 0) {
            double totalPrice = quantity * price;
            System.out.printf("%.2f", totalPrice);
        } else {
            System.out.println("error");
        }
    }
}
