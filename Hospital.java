import java.util.Scanner;

// created by J.M.
public class Hospital {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());

        int doctors = 7;
        int test = 0;
        int noTest = 0;
        for (int i = 1; i <= days; i++) {
            int patient = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0 && noTest > test) {
                doctors += 1;
            }
            if (patient < doctors) {
                test += patient;
            } else {
                test += doctors;
                noTest += (patient - doctors);
            }
        }
        System.out.printf("Treated patients: %d.%n", test);
        System.out.printf("Untreated patients: %d.", noTest);
    }
}
