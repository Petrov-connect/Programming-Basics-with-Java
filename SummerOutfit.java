import java.util.Scanner;

// created by J.M.
public class SummerOutfit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String dayOrNight = scan.nextLine();

        String Outfit = "";
        String Shoes = "";

        switch (dayOrNight) {
            case "Morning":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                } else if (18 < degrees && degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (degrees >= 25) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (18 < degrees && degrees <= 24) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                } else if (degrees >= 25) {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (10 <= degrees && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (18 < degrees && degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if (degrees >= 25) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
