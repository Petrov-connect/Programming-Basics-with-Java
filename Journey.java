import java.util.Scanner;
// created by J.M.
public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination;
        String place ="";
        double price = 0.0;
        if (budget <= 100) { destination ="Bulgaria";
            switch (season) {
                case "summer":
                    price = budget * 0.3;
                    place= "Camp";
                    break;
                case "winter":
                    price = budget * 0.7;
                    place="Hotel";
                    break;
            }
        } else if (budget <= 1000) { destination = "Balkans";
            switch (season) {
                case "summer":
                    price = budget * 0.4;
                    place = "Camp";
                    break;
                case "winter":
                    price = budget * 0.8;
                    place = "Hotel";
                    break;
            }
        }else  {
            price = budget * 0.9;
            place="Hotel";
            destination="Europe";
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",place,price);
    }
}
