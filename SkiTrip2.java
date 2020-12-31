import java.util.Scanner;

// created by J.M.
public class SkiTrip2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String eval = sc.nextLine();

        int nights = days - 1;
        double price = 0.0;

        switch (room) {
            case "room for one person":
                price += 18;
                break;
            case "apartment":
                price = 25;
                if (nights < 10) {
                    price *= 0.7;
                } else if (nights <= 15) {
                    price *= 0.65;
                } else {
                    price /= 2;
                }
                break;
            case "president apartment":
                price = 35;
                if (nights < 10) {
                    price *= 0.9;
                } else if (nights <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.8;
                }
                break;
        }
        double sum = price * nights;
        if (eval.equals("positive")) {
            sum *= 1.25;
        } else {
            sum *= 0.9;
        }
        System.out.printf("%.2f", sum);
    }
}