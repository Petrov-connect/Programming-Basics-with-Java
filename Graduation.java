import java.util.Scanner;
// created by J.M.
public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double evaluaSum = 0.0;
        for(int i =1; i<=12; i++){
            double evalua = Double.parseDouble(scan.nextLine());
            while (evalua<4){
                evalua = Double.parseDouble(scan.nextLine());
            }
                evaluaSum+=evalua;
        }
        System.out.printf("%s graduated. Average grade: %.2f",name,evaluaSum/12);
    }
}
