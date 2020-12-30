import java.util.Scanner;

// created by J.M.
public class CarToGo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String typeCar;
        String typeClass;
        double price;
        if (budget <= 100) {
            typeClass = "Economy class";
            typeCar = season.equals("Summer") ? "Cabrio" : "Jeep";
            price = season.equals("Summer") ? budget * 0.35 : budget * 0.65;
        } else if (budget > 100 && budget <= 500) {
            typeClass = "Compact class";
            typeCar = season.equals("Summer") ? "Cabrio" : "Jeep";
            price = season.equals("Summer") ? budget * 0.45 : budget * 0.8;
        } else {
            typeClass = "Luxury class";
            typeCar = "Jeep";
            price = budget * 0.90;
        }
        System.out.println(typeClass);
        System.out.printf("%s - %.2f", typeCar, price);
    }
}
