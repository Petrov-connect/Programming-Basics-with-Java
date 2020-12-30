import java.util.Scanner;

// created by J.M.
public class DanceHall {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double wardrobeSide = Double.parseDouble(scan.nextLine());

        double areaHall = (length * 100) * (width * 100);
        double areaWardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double areaBench = areaHall / 10;
        double freeSpace = areaHall - areaWardrobe - areaBench;

        System.out.printf("%.0f", Math.floor(freeSpace / (40 + 7000)));

    }
}
