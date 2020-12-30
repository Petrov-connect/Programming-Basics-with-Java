import java.util.Scanner;

// created by J.M.
public class CinemaVoucher {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int voucher = Integer.parseInt(scan.nextLine());
        int countTickets = 0;
        int countElse = 0;
        int sum;
        boolean x = false;
        String text = scan.nextLine();

        while (!text.equals("End")) {
            if (text.length() > 8) {
                sum = text.charAt(0) + text.charAt(1);
                x = true;
            } else {
                sum = text.charAt(0);
            }
            if (sum > voucher) {
                break;
            } else {
                voucher -= sum;
                if (x) {
                    countTickets++;
                    x = false;
                } else {
                    countElse++;
                }
            }
            text = scan.nextLine();
        }
        System.out.println(countTickets);
        System.out.println(countElse);
    }
}
