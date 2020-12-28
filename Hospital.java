import java.util.Scanner;
// created by J.M.
public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int dok = 7;
        int preg = 0;
        int nopreg = 0;
        for (int i = 1; i <= days; i++) {
            int patien = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0 && nopreg > preg) {
                dok += 1;
            }
            if (patien < dok) {
                preg += patien;
            } else {
                preg += dok;
                nopreg += (patien - dok);
            }
        }
        System.out.printf("Treated patients: %d.%n", preg);
        System.out.printf("Untreated patients: %d.", nopreg);
    }
}
