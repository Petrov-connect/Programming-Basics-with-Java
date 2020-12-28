import java.util.Scanner;
// created by J.M.
public class Skeleton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min=Integer.parseInt(scan.nextLine());
        int sec=Integer.parseInt(scan.nextLine());
        double meter=Double.parseDouble(scan.nextLine());
        int perMeter=Integer.parseInt(scan.nextLine());
        double control=sec+min*60.0;
        double delay =meter/120*2.5;
        double time = meter/100.0*perMeter-delay;
        if(time<=control){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",time);
        }else{
            System.out.printf("No, Marin failed! He was %.3f second slower.",time-control);
        }
    }
}
