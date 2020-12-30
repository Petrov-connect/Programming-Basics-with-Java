import java.util.Scanner;

// created by J.M.
public class EasterTrip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        String date = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double price=0;
        switch(destination){
            case"France":
                switch(date){
                    case"21-23": price=30.0; break;
                    case"24-27": price=35.0; break;
                    case"28-31": price=40.0; break;
                }
                break;
            case"Italy":
                switch(date){
                    case"21-23": price=28.0; break;
                    case"24-27": price=32.0; break;
                    case"28-31": price=39.0; break;
                }
                break;
            case"Germany":
                switch(date){
                    case"21-23": price=32.0; break;
                    case"24-27": price=37.0; break;
                    case"28-31": price=43.0; break;
                }
                break;
        }
            double totalPrice=nights*price;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,totalPrice);
    }
}
