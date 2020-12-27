import java.util.Scanner;
// created by J.M.
public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double evaluaSum = 0.0; double evalua = 0.0;
        for(int i =1; i<=12; i++){
             evalua = Double.parseDouble(scan.nextLine());
            while (evalua<4){
                evalua = Double.parseDouble(scan.nextLine());
                if (evalua<4){
                    break;
                }
            } if (evalua<4){
                System.out.printf("%s has been excluded at %d grade",name,i);
                break;
            }
            evaluaSum+=evalua;
        }
        if (evalua>=4) {
            System.out.printf("%s graduated. Average grade: %.2f", name, evaluaSum / 12);
        }
    }
}
