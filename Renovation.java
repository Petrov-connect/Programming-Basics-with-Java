import java.util.Scanner;

//created by J.M.
public class Renovation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wallHeight = Integer.parseInt(scan.nextLine());
        int wallWidth = Integer.parseInt(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        double paintArea = (4.0 * wallHeight * wallWidth);
        paintArea = Math.ceil(paintArea - paintArea * percent / 100);

        String command = scan.nextLine();

        while (!command.equals("Tired!")) {
            int paint = Integer.parseInt(command);
            if (paintArea < paint) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", paint - paintArea);
                break;
            } else if (paintArea == paint) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            }
            paintArea -= paint;
            command = scan.nextLine();
        }
        if (command.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", paintArea);
        }
    }
}