import java.util.Scanner;
// created by J.M.
public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowersType=scan.nextLine();
        int countFlowers=Integer.parseInt(scan.nextLine());
        String season=scan.nextLine();
        double price=0;
        switch (season){
            case"Spring":
                switch (flowersType){
                    case"Sunflower": price=10;break;
                    case"Daisy": price=12*1.1;break;
                    case"Lavender": price=12;break;
                    case"Mint":price=10*1.1;break;
                }
                break;
                case"Summer":
                switch (flowersType){
                    case"Sunflower":
                    case"Daisy":
                    case"Lavender": price=8;break;
                    case"Mint":price=12;break;
                }
                price*=1.1;
                break;
            case"Autumn":
                switch (flowersType){
                    case"Sunflower": price=12;break;
                    case"Daisy":
                    case"Lavender":
                    case"Mint": price=6;break;
                }
                price*=0.95;
                break;
        }
        System.out.printf("Total honey harvested: %.2f",price*countFlowers*1.0);
    }
}
