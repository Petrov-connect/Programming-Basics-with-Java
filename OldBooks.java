import java.util.Scanner;
// created by J.M.
public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        for (int i=1;i<=n;i++) {
            String book = scan.nextLine();
            if (book.equals(text)) {
                System.out.printf("You checked %d books and found it.", i-1);
                break;
            } else if(i==n) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", i);
                break;
            }
        }
    }
}
