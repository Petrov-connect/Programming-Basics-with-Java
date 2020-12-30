import java.util.Scanner;

// created by J.M.
public class InvalidNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if (num < 100 || num > 200) {
            if (num != 0) {

                System.out.println("invalid");
            }
        }
    }
}
