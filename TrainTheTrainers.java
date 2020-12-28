import java.util.Scanner;
// created by J.M.
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double totalSum=0;int count=0;
        String text =scan.nextLine();
        while(!text.equals("Finish")){
            double sum=0;
            for(int i=1; i<=n; i++){
                double evaluation = Double.parseDouble(scan.nextLine());
                sum+=evaluation;
            }
            System.out.printf("%s - %.2f.%n",text,sum/n);
            count++;
            totalSum+=sum;
            text =scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalSum/(n*count));
    }
}
