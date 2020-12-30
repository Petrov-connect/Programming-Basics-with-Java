import java.util.Scanner;

// created by J.M.
public class CharityCampaign {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int cooks = Integer.parseInt(scan.nextLine());
        int cake = Integer.parseInt(scan.nextLine());
        int corr = Integer.parseInt(scan.nextLine());
        int pancake = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", (days * cooks * (cake * 45 + corr * 5.80 + pancake * 3.20)) * 0.875);
    }
}
