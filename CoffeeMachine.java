import java.util.Scanner;
// created by J.M.
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeDrink=scan.nextLine();
        String type=scan.nextLine();
        int count=Integer.parseInt(scan.nextLine());
        double price=0;
        switch(typeDrink){
            case"Espresso":
                switch (type){
                    case"Without": price=0.90*0.65; break;
                    case"Normal": price=1.00; break;
                    case"Extra": price=1.20; break;
                }
                if(count>=5){
                    price*=0.75;
                }
                break;
            case"Cappuccino":
                switch (type){
                    case"Without": price=1.00*0.65; break;
                    case"Normal": price=1.20; break;
                    case"Extra": price=1.60; break;
                }
                break;case"Tea":
                switch (type){
                    case"Without": price=0.50*0.65; break;
                    case"Normal": price=0.60; break;
                    case"Extra": price=0.70; break;
                }
                break;
        }
        double total=count*price;
        if(total>15){
            total*=0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",count,typeDrink,total);
    }
}
