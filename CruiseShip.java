import java.util.Scanner;

// created by J.M.
public class CruiseShip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cruise = scan.nextLine();
        String cabin = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (cruise) {
            case "Mediterranean":
                switch (cabin) {
                    case "standard cabin":
                        price = 27.50;
                        break;
                    case "cabin with balcony":
                        price = 30.20;
                        break;
                    case "apartment":
                        price = 40.50;
                        break;
                }
                break;
            case "Adriatic":
                switch (cabin) {
                    case "standard cabin":
                        price = 22.99;
                        break;
                    case "cabin with balcony":
                        price = 25.00;
                        break;
                    case "apartment":
                        price = 34.99;
                        break;
                }
                break;
            case "Aegean":
                switch (cabin) {
                    case "standard cabin":
                        price = 23.00;
                        break;
                    case "cabin with balcony":
                        price = 26.60;
                        break;
                    case "apartment":
                        price = 39.80;
                        break;
                }
                break;
        }
        double total = nights * price * 4;
        if (nights > 7) {
            total = total * 0.75;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruise, total);
    }
}
