import java.util.Scanner;

// created by J.M.
public class MountainRun {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timePerMeter = Double.parseDouble(scan.nextLine());

        double delay = Math.floor(distance / 50) * 30;
        double timeToTop = distance * timePerMeter + delay;
        double difference = timeToTop - record;

        if (timeToTop < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", timeToTop);
        } else if (timeToTop >= record) {
            System.out.printf("No! He was %.2f seconds slower.", difference);
        }

    }
}
