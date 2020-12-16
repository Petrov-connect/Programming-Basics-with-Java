import java.util.Scanner;
// created by J.M.
public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bottle = Integer.parseInt(scan.nextLine())*750;
        int count = 0; int num; int sumT=0; int sumC=0;
        while(bottle>=0){
            count++;
            String text = scan.nextLine();
            if(text.equals("End")){
                break;
            }else {
                num = Integer.parseInt(text);
                if (count % 3 == 0) {
                    bottle -= (num * 15);
                    sumT += num;
                } else {
                    bottle -= (num * 5);
                    sumC += num;
                }
            }
        }
        if (bottle>=0){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",sumC,sumT);
            System.out.printf("Leftover detergent %d ml.",bottle);
        }else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(bottle));
        }
    }
}
