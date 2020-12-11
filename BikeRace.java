import java.util.Scanner;
// created by J.M.
public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numJuniors = Integer.parseInt(scan.nextLine());
        int numSeniors = Integer.parseInt(scan.nextLine());
        String tip = scan.nextLine();

        double Juniors=0;
        double Seniors=0;

        switch(tip){
            case"trail":
                Juniors=5.5;
                Seniors=7.0;
                break;
            case"cross-country":
                Juniors=8.0;
                Seniors=9.5;
                break;
            case"downhill":
                Juniors=12.25;
                Seniors=13.75;
                break;
            case"road":
                Juniors=20.0;
                Seniors=21.50;
                break;
        }
        if (tip.equals("cross-country")&&(numJuniors+numSeniors)>=50){
            Juniors*=0.75; Seniors*=0.75;
        }
        double totalPrice=((numJuniors*Juniors)+(numSeniors*Seniors))*0.95;
        System.out.printf("%.2f",totalPrice);
    }
}
