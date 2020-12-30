import java.util.Scanner;

// created by J.M.
public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int R = 0;

        for (int i = 1; i <= 3; i++) {
            String m = scan.nextLine();
            int a = m.charAt(0);
            int b = m.charAt(2);
            if (a > b) {
                A++;
            } else if (b > a) {
                B++;
            } else {
                R++;
            }
        }
        System.out.printf("Team won %d games.%n", A);
        System.out.printf("Team lost %d games.%n", B);
        System.out.printf("Drawn games: %d", R);
    }
}
