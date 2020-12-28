import java.util.Scanner;
// created by J.M.
public class TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());
        double price =0.0;
        if(km<=5000){
            switch(season){
                case"Spring":
                case"Autumn":
                    price=0.75;
                    break;
                case"Summer":
                    price=0.9;
                    break;
                case"Winter":
                    price=1.05;
                    break;
            }
        }else if(km<=10000){
            switch(season){
                case"Spring":
                case"Autumn":
                    price=0.95;
                    break;
                case"Summer":
                    price=1.1;
                    break;
                case"Winter":
                    price=1.25;
                    break;
            }
        }else {
            price=1.45;
        }
        double totalPrice=km*price*4*0.9;
        System.out.printf("%.2f",totalPrice);
    }
}
