import java.util.Scanner;

// created by J.M.
public class SchoolCamp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        String typeGroup = scan.nextLine();
        int students = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        double price = 0.0;
        String sport = "";
        double discount = 0.0;

        switch (season) {
            case "Winter":
                price = typeGroup.equals("boys") || typeGroup.equals("girls") ? 9.60 : 10.0;
                switch (typeGroup) {
                    case "girls":
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        sport = "Judo";
                        break;
                    case "mixed":
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                price = typeGroup.equals("boys") || typeGroup.equals("girls") ? 7.20 : 9.50;
                switch (typeGroup) {
                    case "girls":
                        sport = "Athletics";
                        break;
                    case "boys":
                        sport = "Tennis";
                        break;
                    case "mixed":
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                price = typeGroup.equals("boys") || typeGroup.equals("girls") ? 15.0 : 20.0;
                switch (typeGroup) {
                    case "girls":
                        sport = "Volleyball";
                        break;
                    case "boys":
                        sport = "Football";
                        break;
                    case "mixed":
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if (students >= 10 && students < 20) {
            discount = 0.95;
        } else if (students >= 20 && students < 50) {
            discount = 0.85;
        } else if (students >= 50) {
            discount = 0.5;
        }
        double totalPrice = students * nights * price;
        if (discount > 0) {
            totalPrice *= discount;
        }
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
