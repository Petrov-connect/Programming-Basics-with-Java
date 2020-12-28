import java.util.Scanner;
// created by J.M.
public class Vacation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double needMoney = Double.parseDouble(scan.nextLine());
        double haveMoney = Double.parseDouble(scan.nextLine());
        int count =0; int days=0;
        while (haveMoney < needMoney&&count<5){
            String action = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            days +=1;
            if(action.equals("save")){
                haveMoney+=money;
                count = 0;
            }
            else if(action.equals("spend")){
                haveMoney-=money;
                count +=1;
                if (haveMoney<0){
                    haveMoney=0;
                }
            }
        }
        if (count ==5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (haveMoney>=needMoney){
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}