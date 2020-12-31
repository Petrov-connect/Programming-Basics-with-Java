import java.util.Scanner;

// created by J.M.
public class ReportSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = Integer.parseInt(scan.nextLine());

        double sumCc = 0;
        double sumCs = 0;
        int numCs = 0;
        int numCc = 0;
        int count = 0;
        int price;
        int needSum = sum;
        String text = "";

        while (needSum > 0) {
            count++;
            text = scan.nextLine();
            if (text.equals("End")) {
                break;
            } else {
                price = Integer.parseInt(text);
            }
            if (count % 2 == 0) {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sumCc += price;
                    numCc++;
                    needSum -= price;
                }
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sumCs += price;
                    numCs++;
                    needSum -= price;
                }
            }
        }
        if (text.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", sumCs / numCs);
            System.out.printf("Average CC: %.2f", sumCc / numCc);
        }
    }
}
