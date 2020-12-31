import java.util.Scanner;

// created by J.M.
public class MovieDay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int time = Integer.parseInt(scan.nextLine());
        int scene = Integer.parseInt(scan.nextLine());
        int timeScene = Integer.parseInt(scan.nextLine());

        double preparation = time * 0.15;

        if (time >= scene * timeScene + preparation) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.ceil(time - (scene * timeScene + preparation)));
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.ceil((scene * timeScene + preparation) - time));
        }
    }
}
