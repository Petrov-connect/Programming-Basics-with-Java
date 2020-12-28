import java.util.Scanner;
// created by J.M.
public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget=Double.parseDouble(scan.nextLine());
        int card=Integer.parseInt(scan.nextLine());
        int chip=Integer.parseInt(scan.nextLine());
        int ram=Integer.parseInt(scan.nextLine());
        double total=(250.00*card)+(((250.00*card)*0.35)*chip)+(((250.00*card)*0.1)*ram);
        if(card>chip){
            total*=0.85;
        }
        if(budget>=total){
            System.out.printf("You have %.2f leva left!",budget-total);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!",total-budget);
        }
    }
}
