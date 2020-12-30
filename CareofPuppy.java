import java.util.Scanner;

// created by J.M.
public class CareofPuppy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int food = Integer.parseInt(scan.nextLine()) * 1000;

        double sum = 0.0;
        for (; ; ) {
            String eat = scan.nextLine();
            if (eat.equals("Adopted")) {
                break;
            }
            double n = Double.parseDouble(eat);
            sum += n;
        }
        if (food >= sum) {
            System.out.printf("Food is enough! Leftovers: %.0f grams.", food - sum);
        } else {
            System.out.printf("Food is not enough. You need %.0f grams more.", sum - food);
        }
    }
}
