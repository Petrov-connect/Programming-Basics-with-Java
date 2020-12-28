import java.util.Scanner;
// created by J.M.
public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double price; int count=0; double total=0;
        String text = scan.nextLine();
        while(!text.equals("Stop")){
             price = Double.parseDouble(scan.nextLine());
             count++;
             if(count%3==0){
                 price/=2.0;
             }
             if(budget>=price){
                    budget-=price;
                    total+=price;
             }else{
                 System.out.println("You don't have enough money!");
                 System.out.printf("You need %.2f leva!",price-budget);
                 break;
             }
            text = scan.nextLine();
            if(text.equals("Stop")){
                System.out.printf("You bought %d products for %.2f leva.",count,total);
            }
        }
    }
}
