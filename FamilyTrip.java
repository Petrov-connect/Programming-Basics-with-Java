import java.util.Scanner;
// created by J.M.
public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget=Double.parseDouble(scan.nextLine());
        int nights=Integer.parseInt(scan.nextLine());
        double price=Double.parseDouble(scan.nextLine());
        int percent=Integer.parseInt(scan.nextLine());
        budget-=budget*(1.0*percent/100);
        if(nights>7){
            price*=0.95;
        }
        double total=nights*price;
        if(total<=budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-total);
        }else{
            System.out.printf("%.2f leva needed.",total-budget);
        }
    }
}
