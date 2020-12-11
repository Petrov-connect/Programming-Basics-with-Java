import java.util.Scanner;
// created by J.M.
public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        double year = Double.parseDouble(scan.nextLine());
        double n = year - 1800;
        int y = 18;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {

                money = money - (12000 + 50 * y);
            }
            y++;
        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}