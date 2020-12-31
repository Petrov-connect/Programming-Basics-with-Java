import java.util.Scanner;

// created by J.M.
public class MetricConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String exit = scan.nextLine();

        if (input.equals("m") && exit.equals("cm")) {
            System.out.printf("%.3f", num * 100);
        } else if (input.equals("m") && exit.equals("mm")) {
            System.out.printf("%.3f", num * 1000);
        } else if (input.equals("cm") && exit.equals("m")) {
            System.out.printf("%.3f", num / 100);
        } else if (input.equals("cm") && exit.equals("mm")) {
            System.out.printf("%.3f", num * 10);
        } else if (input.equals("mm") && exit.equals("m")) {
            System.out.printf("%.3f", num / 1000);
        } else if (input.equals("mm") && exit.equals("cm")) {
            System.out.printf("%.3f", num / 10);
        }
    }
}
