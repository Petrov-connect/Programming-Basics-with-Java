import java.util.Scanner;

// created by J.M.
public class Oscars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nameActor = scan.nextLine();
        double points = Double.parseDouble(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scan.nextLine();
            double points1 = Double.parseDouble(scan.nextLine());
            double total = text.length() * points1 / 2;
            points += total;
            if (points > 1250.5) {
                break;
            }
        }
        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - points);
        }
    }
}
