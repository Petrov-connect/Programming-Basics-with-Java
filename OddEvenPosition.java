import java.util.Scanner;
// created by J.M.
public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxOdd =Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;
        double maxEven = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;
        double sumOdd =0.0; double sumEven =0.0;
        for(int i =1; i<=n; i++){
            double a = Double.parseDouble(scan.nextLine());
            if(i%2==0){
                sumEven+=a;
                if(a>maxEven){
                    maxEven=a;
                }if(a<minEven){
                    minEven=a;
                }
            }else {
                sumOdd+=a;
                if(a>maxOdd){
                    maxOdd=a;
                }if(a<minOdd){
                    minOdd=a;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n",sumOdd);
        if(minOdd==Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }else{
            System.out.printf("OddMin=%.2f,%n",minOdd);
        }if(maxOdd==Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }else {
            System.out.printf("OddMax=%.2f,%n",maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n",sumEven);
        if(minEven==Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else {
            System.out.printf("EvenMin=%.2f,%n",minEven);
        }if(maxEven==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f%n",maxEven);
        }
    }
}
