import java.util.Scanner;

// created by J.M.
public class FootballTournament {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());

        int countW = 0;
        int countD = 0;
        int countL = 0;
        int points = 0;

        if (num == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            for (int i = 1; i <= num; i++) {
                String type = scan.nextLine();
                if (type.equals("W")) {
                    countW++;
                    points += 3;
                } else if (type.equals("D")) {
                    countD++;
                    points += 1;
                } else {
                    countL++;
                }
            }
            System.out.printf("%s has won %d points during this season.%n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countW);
            System.out.printf("## D: %d%n", countD);
            System.out.printf("## L: %d%n", countL);
            System.out.printf("Win rate: %.2f%%", 1.0 * countW / num * 100);
        }
    }
}
