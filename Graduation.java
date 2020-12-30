import java.util.Scanner;

// created by J.M.
public class Graduation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        double evaluateSum = 0.0;
        for (int i = 1; i <= 12; i++) {
            double evaluate = Double.parseDouble(scan.nextLine());
            while (evaluate < 4) {
                evaluate = Double.parseDouble(scan.nextLine());
            }
            evaluateSum += evaluate;
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, evaluateSum / 12);
    }
}
