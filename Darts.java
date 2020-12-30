import java.util.Scanner;

// created by J.M.
public class Darts {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        boolean points301 = false;
        int points = 301;
        int count = 0;
        int countFalse = 0;
        String sector = scan.nextLine();

        while (!sector.equals("Retire")) {
            int shot = Integer.parseInt(scan.nextLine());
            switch ((sector)) {
                case "Single":
                    shot *= 1;
                    break;
                case "Double":
                    shot *= 2;
                    break;
                case "Triple":
                    shot *= 3;
                    break;
            }
            if (shot > points) {
                countFalse++;
                sector = scan.nextLine();
                continue;
            }
            points -= shot;
            count++;
            if (points == 0) {
                points301 = true;
                break;
            }
            sector = scan.nextLine();
        }
        if (points301) {
            System.out.printf("%s won the leg with %d shots.", name, count);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, countFalse);
        }
    }
}
