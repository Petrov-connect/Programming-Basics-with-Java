import java.util.Scanner;

// created by J.M.
public class WeddingSeats {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int last = scan.nextLine().charAt(0);
        int rows = Integer.parseInt(scan.nextLine());
        int seats = Integer.parseInt(scan.nextLine());

        int count = 0;

        for (int i = 65; i <= last; i++) {
            for (int j = 1; j <= rows; j++) {
                int k;
                if (j % 2 == 0) {
                    k = seats + 2;
                } else {
                    k = seats;
                }
                for (int m = 97; m <= 96 + k; m++) {
                    char sector = (char) i;
                    char seat = (char) m;
                    System.out.printf("%c%d%c %n", sector, j, seat);
                    count++;
                }
            }
            rows++;
        }
        System.out.println(count);
    }
}
