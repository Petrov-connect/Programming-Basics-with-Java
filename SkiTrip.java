import java.util.Scanner;
// created by J.M.
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double day = Double.parseDouble(scan.nextLine());
        String roomType = scan.nextLine();
        String grade = scan.nextLine();
        double night = day - 1;
        double price = 0.0;
        switch (roomType) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                break;
            case "president apartment":
                price = 35;
                break;
        }
        double totalPrice = night * price;
        if (roomType.equals("apartment")) {
            if (day < 10) {
                totalPrice *= 0.7;
            } else if (day >= 10 && day <= 15) {
                totalPrice *= 0.65;
            } else if (day > 15) {
                totalPrice *= 0.5;
            }
        } else if (roomType.equals("president apartment")) {
            if (day < 10) {
                totalPrice *= 0.9;
            } else if (day >= 10 && day <= 15) {
                totalPrice *= 0.85;
            } else if (day > 15) {
                totalPrice *= 0.8;
            }
        }
        if (grade.equals("positive")) {
            totalPrice *= 1.25;
        } else if (grade.equals("negative")) {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
