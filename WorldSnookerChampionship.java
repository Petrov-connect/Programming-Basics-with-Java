import java.util.Scanner;
// created by J.M.
public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stage=scan.nextLine();
        String ticket=scan.nextLine();
        int numTickets=Integer.parseInt(scan.nextLine());
        char picture=scan.nextLine().charAt(0);
        boolean yes=false;
        double price=0;
        switch (stage){
            case"Quarter final":
                switch (ticket){
                    case"Standard": price=55.50; break;
                    case"Premium": price=105.20; break;
                    case"VIP": price=118.90; break;
                }
                break;
            case"Semi final":
                switch (ticket){
                    case"Standard": price=75.88; break;
                    case"Premium": price=125.22; break;
                    case"VIP": price=300.40; break;
                }
                break;
            case"Final":
                switch (ticket){
                    case"Standard": price=110.10; break;
                    case"Premium": price=160.66; break;
                    case"VIP": price=400.00; break;
                }
                break;
        }
        if(picture=='Y'){
            yes=true;
        }
        double totalPrice=numTickets*price;
        if(totalPrice>4000){
            yes=false;
            totalPrice*=0.75;
        }else if(totalPrice>2500){
            totalPrice*=0.9;
        }
        if(yes){
            totalPrice+=numTickets*40;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
