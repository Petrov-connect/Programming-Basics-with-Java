import java.util.Scanner;

// created by J.M.
public class ExamPreparation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double sumEvaluation = 0;
        String lastEvaluation = "";
        String text;
        int evaluation;
        int count = 0;
        int filed = n;

        while (true) {
            text = scan.nextLine();
            if (text.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", sumEvaluation / count);
                System.out.printf("Number of problems: %d%n", count);
                System.out.printf("Last problem: %s", lastEvaluation);
                break;
            }
            evaluation = Integer.parseInt(scan.nextLine());
            if (evaluation <= 4) {
                n--;
                if (n == 0) {
                    System.out.printf("You need a break, %d poor grades.", filed);
                    break;
                }
            }
            sumEvaluation += evaluation;
            lastEvaluation = text;
            count++;
        }
    }
}
