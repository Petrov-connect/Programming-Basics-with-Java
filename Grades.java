import java.util.Scanner;
// created by J.M.
public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int stud5=0;int stud4=0;int stud3=0;int stud2=0;double totalocenka=0;
        for(int i = 1; i<=count; i++){
          double ocenka = Double.parseDouble(scan.nextLine());
          totalocenka+=ocenka;
            if(ocenka>=5){
                stud5+=1;
            }else if(ocenka>=4){
                stud4+=1;
            }else if(ocenka>=3){
                stud3+=1;
            }else {
                stud2+=1;
            }
        }
        totalocenka /=count;
        double procstud5=1.0*stud5/count*100;
        double procstud4=1.0*stud4/count*100;
        double procstud3=1.0*stud3/count*100;
        double procstud2=1.0*stud2/count*100;
        System.out.printf("Top students: %.2f%%%n",procstud5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",procstud4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",procstud3);
        System.out.printf("Fail: %.2f%%%n",procstud2);
        System.out.printf("Average: %.2f",totalocenka);
    }
}
