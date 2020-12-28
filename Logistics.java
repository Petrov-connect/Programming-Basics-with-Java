import java.util.Scanner;
// created by J.M.
public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        double totalton=0;int tonbus=0;int tontruk=0;int tonvlak=0;
        for (int i =1; i <=count; i++){
            int ton = Integer.parseInt(scan.nextLine());
            totalton+=ton;
            if(ton<=3){
             tonbus +=ton;
            }else if(ton<=11){
                 tontruk+=ton;
            }else {
                 tonvlak+=ton;
            }
        }
        double price=(tonbus*200+tontruk*175+tonvlak*120)/totalton;
        double procbus=tonbus/totalton*100;
        double proctruk=tontruk/totalton*100;
        double procvlak=tonvlak/totalton*100;
        System.out.printf("%.2f%n",price);
        System.out.printf("%.2f%%%n",procbus);
        System.out.printf("%.2f%%%n",proctruk);
        System.out.printf("%.2f%%",procvlak);
    }
}
