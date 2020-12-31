import java.util.Scanner;

// created by J.M.
public class MultiplyBy2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());

        while (true) {
            if (num < 0) {
                System.out.println("Negative number!");
                break;
            }
            num *= 2;
            System.out.printf("Result: %.2f%n", num);
            num = Double.parseDouble(scan.nextLine());

        }
    }
}


