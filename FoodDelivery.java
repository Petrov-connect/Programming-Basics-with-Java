import java.util.Scanner;
// created by J.M.
public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int vegetable = Integer.parseInt(scan.nextLine());
        double totalPrice=chicken*10.35+fish*12.40+vegetable*8.15;
        totalPrice=totalPrice+totalPrice*0.2+2.50;
        System.out.printf("Total: %.2f",totalPrice);
    }
}
