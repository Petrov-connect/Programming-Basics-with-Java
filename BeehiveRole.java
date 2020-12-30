import java.util.Scanner;

// created by J.M.
public class BeehiveRole {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int intellect = Integer.parseInt(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        String sex = scan.nextLine();

        String type;
        if (intellect >= 80 && sex.equals("female")) {
            type = "Queen Bee";
        } else if (intellect >= 80) {
            type = "Repairing Bee";
        } else if (intellect >= 60) {
            type = "Cleaning Bee";
        } else if (power >= 80 && sex.equals("male")) {
            type = "Drone Bee";
        } else if (power >= 60) {
            type = "Guard Bee";
        } else {
            type = "Worker Bee";
        }
        System.out.printf("%s", type);
    }
}
