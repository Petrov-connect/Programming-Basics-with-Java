import java.util.Scanner;
// created by J.M.
public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int naelon=Integer.parseInt(scan.nextLine());
        int boq=Integer.parseInt(scan.nextLine());
        int razreditel=Integer.parseInt(scan.nextLine());
        int hours=Integer.parseInt(scan.nextLine());
        double totalboq=boq+boq*0.1; double totalnaelon=naelon+2.0;
        double sum=totalboq*14.50+totalnaelon*1.50+razreditel*5.00+0.40;
        double workSum=sum*0.3*hours;
        double totalSum=sum+workSum;
        System.out.printf("Total expenses: %.2f lv.",totalSum);
    }
}
