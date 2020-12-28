import java.util.Scanner;
// created by J.M.
public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double volume = Double.parseDouble(scan.nextLine());
        double count = 0.0;
        for(int i = 1; i<Integer.MAX_VALUE; i++){
            String n = scan.nextLine();
            if(n.equals("End")){
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }
            double bag = Double.parseDouble(n);
            if (i%3==0){
                bag*=1.1;
            }
            if(bag>volume){
                System.out.println("No more space!");
                break;
            }
            volume-=bag; count++;
        }
        System.out.printf("Statistic: %.0f suitcases loaded.",count);
    }
}
