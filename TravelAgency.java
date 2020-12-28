import java.util.Scanner;
// created by J.M.
public class TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town=scan.nextLine();
        String packet=scan.nextLine();
        String vip=scan.nextLine();
        int days=Integer.parseInt(scan.nextLine());
        double price=0; boolean x = true;
        if(days<1){
            System.out.println("Days must be positive number!");
            x = false;
        } else if(days>7){
            days-=1;
        }
        if(x) {
            switch (town) {
                case "Bansko":
                case "Borovets":
                    switch (packet) {
                        case "noEquipment":
                            price = vip.equals("yes") ? 80.00 * 0.95 : 80.00;
                            break;
                        case "withEquipment":
                            price = vip.equals("yes") ? 100.0 * 0.9 : 100.0;
                            break;
                        default:
                            System.out.println("Invalid input!");
                            x = false;
                    }
                    break;
                case "Varna":
                case "Burgas":
                    switch (packet) {
                        case "noBreakfast":
                            price = vip.equals("yes") ? 100.0 * 0.93 : 100.0;
                            break;
                        case "withBreakfast":
                            price = vip.equals("yes") ? 130.0 * 0.88 : 130.0;
                            break;
                        default:
                            System.out.println("Invalid input!");
                            x = false;
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    x = false;
            }
        }
        if(x)
        System.out.printf("The price is %.2flv! Have a nice time!",days*price);
    }
}
