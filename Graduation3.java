import java.util.Scanner;
// created by J.M.
public class Graduation3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum     = 0.0;
        String name    = sc.nextLine();
        int    counter = 1;
        int    bad     = 0;
        while (counter <= 12) {
            double newG = Double.parseDouble(sc.nextLine());
            if ( newG < 4.00 ) {
                bad++;
                if (bad==2) break;
                continue;
            }
            sum += newG;
            counter++;
        }
        if ( bad == 2 ) {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        }
        else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }
    }
}
