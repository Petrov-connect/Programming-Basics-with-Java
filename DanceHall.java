import java.util.Scanner;
// created by J.M.
public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lengh = Double.parseDouble(scan.nextLine());
        double widht = Double.parseDouble(scan.nextLine());
        double wardrobeSide = Double.parseDouble(scan.nextLine());
        double areaHall = (lengh * 100) * (widht * 100);
        double areaWardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double areaBench = areaHall / 10;
        double freeSpace = areaHall - areaWardrobe - areaBench;
        System.out.printf("%.0f", Math.floor(freeSpace / (40 + 7000)));


    }
}
