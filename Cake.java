import java.util.Scanner;

// created by J.M.
public class Cake {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int total = a * b;
        for (; ; ) {
            String n = scan.nextLine();
            if (n.equals("STOP")) {
                System.out.printf("%d pieces are left.", total);
                break;
            } else {
                int left = Integer.parseInt(n);
                total -= left;
                if (total <= 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(total));
                    break;
                }
            }
        }
    }
}
