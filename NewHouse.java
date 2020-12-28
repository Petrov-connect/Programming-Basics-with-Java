import java.util.Scanner;
// created by J.M.
public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowersType = scan.nextLine();
        int flowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        switch (flowersType) {
            case "Roses": price = 5;        break;
            case "Dahlias": price = 3.80;   break;
            case "Tulips": price = 2.80;    break;
            case "Narcissus": price = 3;    break;
            case "Gladiolus": price = 2.50; break;
        }
        double totalPrice = price * flowers;

        if (flowersType.equals("Roses") && flowers > 80) {
            totalPrice *= 0.9;
        }
        else if (flowersType.equals("Dahlias") && flowers > 90) {
            totalPrice *= 0.85;
        }
        else if (flowersType.equals("Tulips") && flowers > 80) {
            totalPrice *= 0.85;
        }
        else if (flowersType.equals("Narcissus") && flowers < 120) {
            totalPrice *= 1.15;
        }
        else if (flowersType.equals("Gladiolus") && flowers < 80) {
            totalPrice *= 1.2;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowers, flowersType, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}
