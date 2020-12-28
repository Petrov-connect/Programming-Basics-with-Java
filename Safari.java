import java.util.Scanner;
// created by J.M.
public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        double gas = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();
        double total=100+gas*2.10;
        switch(day){
            case"Saturday": total*=0.9; break;
            case"Sunday": total*=0.80; break;
        }
        if(budget>=total){
            System.out.printf("Safari time! Money left: %.2f lv. ",budget-total);
        }else{
            System.out.printf("Not enough money! Money needed: %.2f lv.",total-budget);
        }
    }
}
