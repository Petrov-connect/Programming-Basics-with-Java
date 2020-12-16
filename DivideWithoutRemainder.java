import java.util.Scanner;
// created by J.M.
public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double p1=0.0;double p2=0.0;double p3=0.0;
        for(int i = 1; i<=n; i++){
            int num = Integer.parseInt(scan.nextLine());
            if(num%2==0){
                p1++;
            }if(num%3==0){
                p2++;
            }if(num%4==0){
                p3++;
            }
        }
        System.out.printf("%.2f%%%n",1.0*p1/n*100);
        System.out.printf("%.2f%%%n",1.0*p2/n*100);
        System.out.printf("%.2f%%",1.0*p3/n*100);
    }
}
