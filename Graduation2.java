import java.util.Scanner;

// created by J.M.
public class Graduation2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        double evaluateSum = 0.0;
        double evaluate = 0.0;

        for (int i = 1; i <= 12; i++) {
            evaluate = Double.parseDouble(scan.nextLine());
            while (evaluate < 4) {
                evaluate = Double.parseDouble(scan.nextLine());
                if (evaluate < 4) {
                    break;
                }
            }
            if (evaluate < 4) {
                System.out.printf("%s has been excluded at %d grade", name, i);
                break;
            }
            evaluateSum += evaluate;
        }
        if (evaluate >= 4) {
            System.out.printf("%s graduated. Average grade: %.2f", name, evaluateSum / 12);
        }
    }
}
