import java.util.Scanner;
// created by J.M.
public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size = scan.nextLine();
        String color = scan.nextLine();
        int part = Integer.parseInt(scan.nextLine());
        double price=0;
        switch(size){
            case"Large":
                switch(color){
                    case"Red": price=16.0; break;
                    case"Green": price=12.0; break;
                    case"Yellow": price=9.0; break;
                }
                break;
            case"Medium":
                switch(color){
                    case"Red": price=13.0; break;
                    case"Green": price=9.0; break;
                    case"Yellow": price=7.0; break;
                }
                break;
            case"Small":
                switch(color){
                    case"Red": price=9.0; break;
                    case"Green": price=8.0; break;
                    case"Yellow": price=5.0; break;
                }
                break;
        }
        double totalPrice=part*price;
        totalPrice=totalPrice-totalPrice*0.35;
        System.out.printf("%.2f leva.",totalPrice);

    }
}
