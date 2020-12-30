import java.util.Scanner;

// created by J.M.
public class HoneyWinterReserves {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int honey = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();

        double totalHoney = 0;
        boolean honeyNeeded = true;

        while (!name.equals("Winter has come")) {
            double total = 0;
            for (int i = 1; i <= 6; i++) {
                double beesWork = Double.parseDouble(scan.nextLine());
                total += beesWork;
            }
            if (total < 0) {
                System.out.printf("%s was banished for gluttony%n", name);
            }
            totalHoney += total;
            if (totalHoney >= honey) {
                System.out.printf("Well done! Honey surplus %.2f.", totalHoney - honey);
                honeyNeeded = false;
                break;
            }
            name = scan.nextLine();
        }
        if (honeyNeeded) {
            System.out.printf("Hard Winter! Honey needed %.2f.", honey - totalHoney);
        }
    }
}
