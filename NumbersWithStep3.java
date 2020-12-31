import java.util.Scanner;

// created by J.M.
public class NumbersWithStep3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= a; i += 3) {
            System.out.println(i);
        }
    }
}
