import java.util.Scanner;

// created by J.M.
public class EasterCompetition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        int points = 0;
        String win = "";
        String e = "";
        int maxPoints = Integer.MIN_VALUE;
        for (int i = 1; i <= num; i++) {
            String name = scan.nextLine();
            while (!e.equals("Stop")) {
                e = scan.nextLine();
                if (e.equals("Stop")) {
                    System.out.printf("%s has %d points.%n", name, points);
                    if (maxPoints < points) {
                        System.out.printf("%s is the new number 1!%n", name);
                        maxPoints = points;
                        win = name;
                    }
                    points = 0;
                } else {
                    int a = Integer.parseInt(e);
                    points += a;
                }
            }
            e = "";
        }
        System.out.printf("%s won competition with %d points!", win, maxPoints);
    }
}
