import java.util.Scanner;
// created by J.M.
public class ExamResults2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text=scan.nextLine();
        while (!text.equals("Midnight")){
            double sum=0; boolean x=true;
            for(int i=1; i<=6; i++){
                int num=Integer.parseInt(scan.nextLine());
                if(num<0){
                    System.out.printf("%s was cheating!%n",text);
                    x=false;
                    break;
                }
                sum+=num;
            }if(x) {
                sum = Math.floor(sum / 600 * 100);
                sum = sum*0.06;
                if (sum >= 5) {
                    System.out.println("===================");
                    System.out.println("|   CERTIFICATE   |");
                    System.out.printf("|    %.2f/6.00    |%n", sum);
                    System.out.println("===================");
                    System.out.printf("Issued to %s%n",text);
                }else if(sum<3){
                    sum=2;
                    System.out.printf("%s - %.2f%n",text,sum);
                }
                else{
                    System.out.printf("%s - %.2f%n",text,sum);
                }
            }
            text=scan.nextLine();
        }
    }
}
