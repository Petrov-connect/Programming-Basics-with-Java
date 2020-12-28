import java.util.Scanner;
// created by J.M.
public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =Integer.parseInt(scan.nextLine());
        double p1=0;double p2=0;double p3=0;double p4=0;double p5=0;
        for(int i=1; i<=n; i++){
            int num = Integer.parseInt(scan.nextLine());
            if(num<200){
                p1+=1;
            }else if(num<=399){
                p2+=1;
            }else if(num<=599){
                p3+=1;
            }else if(num<=799){
                p4+=1;
            }else {
                p5+=1;
            }
        }
        System.out.printf("%.2f%%%n",1.0*p1/n*100);
        System.out.printf("%.2f%%%n",1.0*p2/n*100);
        System.out.printf("%.2f%%%n",1.0*p3/n*100);
        System.out.printf("%.2f%%%n",1.0*p4/n*100);
        System.out.printf("%.2f%%",1.0*p5/n*100);
    }
}
