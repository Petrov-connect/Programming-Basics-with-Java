import java.util.Scanner;

// created by J.M.
public class Firm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int needHours = Integer.parseInt(scan.nextLine());
        int daysForWork = Integer.parseInt(scan.nextLine());
        int employees = Integer.parseInt(scan.nextLine());

        double hours = Math.floor((employees * 2 * daysForWork) + (daysForWork * 0.9 * 8));
        if (hours >= needHours) {
            double left = hours - needHours;
            System.out.printf("Yes!%.0f hours left.", left);
        } else {
            double needed = needHours - hours;
            System.out.printf("Not enough time!%.0f hours needed.", needed);
        }
    }
}
