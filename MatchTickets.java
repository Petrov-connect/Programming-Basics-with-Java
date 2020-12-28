import java.util.Scanner;
// created by J.M.
public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int numPeople = Integer.parseInt(scan.nextLine());

        double discount;

        if (numPeople <= 4) {
            discount = 75;
        } else if (numPeople <= 9) {
            discount = 60;
        } else if (numPeople <= 24) {
            discount = 50;
        } else if (numPeople <= 49) {
            discount = 40;
        } else {
            discount = 25;
        }
        double price=0;
        switch (category) {
            case "VIP":
                price = (numPeople * 499.99) ;
                break;
            case "Normal":
                price = (numPeople * 249.99) ;
                break;
        }
        double totalBudget = budget -(budget*(discount/100));
        if(totalBudget>=price){

            System.out.printf("Yes! You have %.2f leva left.",totalBudget-price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",price-totalBudget);
        }
    }
}
