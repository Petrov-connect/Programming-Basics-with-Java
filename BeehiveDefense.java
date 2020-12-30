import java.util.Scanner;

// created by J.M.
public class BeehiveDefense {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countBees = Integer.parseInt(scan.nextLine());
        int healthBeer = Integer.parseInt(scan.nextLine());
        int attackBeer = Integer.parseInt(scan.nextLine());

        boolean bearWin = true;
        while (countBees >= 100) {
            countBees -= attackBeer;
            healthBeer -= countBees * 5;
            if (healthBeer <= 0) {
                System.out.printf("Beehive won! Bees left %d.", countBees);
                bearWin = false;
                break;
            }
        }
        if (bearWin) {
            if (countBees < 0) {
                countBees = 0;
            }
            System.out.printf("The bear stole the honey! Bees left %d.", countBees);
        }
    }
}
