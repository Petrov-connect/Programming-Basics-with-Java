import java.util.Scanner;

// created by J.M.
public class Walking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String steps;
        int leftSteps = 10000;
        int step;

        while (leftSteps > 0) {
            steps = scan.nextLine();
            if (steps.equals("Going home")) {
                steps = scan.nextLine();
                step = Integer.parseInt(steps);
                leftSteps -= step;
                if (leftSteps > 0) {
                    System.out.printf("%d more steps to reach goal.", leftSteps);
                }
                break;
            }
            step = Integer.parseInt(steps);
            leftSteps -= step;
        }
        if (leftSteps <= 0) {
            System.out.println("Goal reached! Good job!");
        }
    }
}
