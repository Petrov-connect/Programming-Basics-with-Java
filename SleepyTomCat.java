import java.util.Scanner;

// created by J.M.
public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int d = Integer.parseInt(scan.nextLine());

        int wd = 365 - d;
        int min = d * 127 + wd * 63;
        int diff = Math.abs(30000 - min);
        int h = diff / 60;
        double m = diff % 60;

        if (30000 > min) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %.0f minutes less for play", h, m);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %.0f minutes more for play", h, m);
        }
    }
}
