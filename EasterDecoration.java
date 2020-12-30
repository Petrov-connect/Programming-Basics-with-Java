import java.util.Scanner;

// created by J.M.
public class EasterDecoration {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        double price = 0;
        int count = 0;
        int client = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= client; i++) {
            String text = scan.nextLine();
            while (!text.equals("Finish")) {
                switch (text) {
                    case "basket":
                        price += 1.5;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7.00;
                        break;
                }
                count++;
                text = scan.nextLine();
                if (text.equals("Finish")) {
                    if (count % 2 == 0) {
                        price *= 0.8;
                    }
                    System.out.printf("You purchased %d items for %.2f leva.%n", count, price);
                    count = 0;
                    totalPrice += price;
                    price = 0;
                }
            }
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalPrice / client);
    }
}
