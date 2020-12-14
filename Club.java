import java.util.Scanner;
// created by J.M.
public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double profit=Double.parseDouble(scan.nextLine());
        double total=0;
        String cocktail=scan.nextLine();
        while (!cocktail.equals("Party!")){
            int num=Integer.parseInt(scan.nextLine());
            double price=cocktail.length()*num;
            if(!(price%2==0)){
                price*=0.75;
            }
            total+=price;
            if(total>=profit){
                System.out.println("Target acquired.");
                break;
            }
            cocktail=scan.nextLine();
        }
        if(cocktail.equals("Party!")){
            System.out.printf("We need %.2f leva more.%n",profit-total);
        }
        System.out.printf("Club income - %.2f leva.",total);
    }
}
