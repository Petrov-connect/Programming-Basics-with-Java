import java.util.Scanner;
// created by J.M.
public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());
        for(int i = 1; i <= n; i++){
            String text = scan.nextLine();
            switch(text){
                case"Facebook":
                    salary-=150;
                    break;
                case"Instagram":
                    salary-=100;
                    break;
                case"Reddit":
                    salary-=50;
                    break;
            }if(salary<=0){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if(salary>0){
            System.out.printf("%.0f",salary);
        }
    }
}
