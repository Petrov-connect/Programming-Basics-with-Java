import java.util.Scanner;
// created by J.M.
public class MovieStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget=Double.parseDouble(scan.nextLine());
        double salary;
        String text=scan.nextLine();
        while(!text.equals("ACTION")){
            if(text.length()>15){
                salary=budget*0.2;
            }else{
                salary=Double.parseDouble(scan.nextLine());
            }
            budget-=salary;
            if(budget<0){
                break;
            }
            text=scan.nextLine();
        }
        if(budget>=0){
            System.out.printf("We are left with %.2f leva.",budget);
        }else{
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }
    }
}
