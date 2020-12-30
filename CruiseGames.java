import java.util.Scanner;

//created by J.M.
public class CruiseGames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());

        String nameGames;
        int points;
        double sumVolleyball = 0;
        double sumTennis = 0;
        double sumBadminton = 0;
        int volleyball = 0;
        int tennis = 0;
        int badminton = 0;
        for (int i = 1; i <= games; i++) {
            nameGames = scan.nextLine();
            points = Integer.parseInt(scan.nextLine());
            switch (nameGames) {
                case "volleyball":
                    sumVolleyball += points * 1.07;
                    volleyball++;
                    break;
                case "tennis":
                    sumTennis += points * 1.05;
                    tennis++;
                    break;
                case "badminton":
                    sumBadminton += points * 1.02;
                    badminton++;
                    break;
            }
        }
        double total = Math.floor(sumVolleyball + sumBadminton + sumTennis);

        sumVolleyball = (sumVolleyball / volleyball);
        sumTennis = (sumTennis / tennis);
        sumBadminton = (sumBadminton / badminton);


        if (sumVolleyball >= 75 && sumTennis >= 75 && sumBadminton >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, total);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", name, total);
        }
    }
}
