import java.util.Scanner;
// created by J.M.
public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = Double.parseDouble(scan.nextLine());
        double price = meters * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %.2f lv." , finalPrice );
        System.out.println();
        System.out.printf("The discount is: %.2f lv." , discount );
    }
}
