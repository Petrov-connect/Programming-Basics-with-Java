import java.util.Scanner;
// created by J.M.
public class Savings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = Double.parseDouble(scan.nextLine());
        int mont = Integer.parseInt(scan.nextLine());
        double spend = Double.parseDouble(scan.nextLine());
        double saveMoney =(salary -((salary*0.3)+spend));  double proc = saveMoney/salary*100;
        System.out.printf("She can save %.2f%%%n",proc);
        System.out.printf("%.2f",saveMoney*mont);
    }
}
