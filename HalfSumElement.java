import java.util.Scanner;
// created by J.M.
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum=0; int biger=Integer.MIN_VALUE;
        for (int i =1; i<=n; i++){
            int a =Integer.parseInt(scan.nextLine());
            sum=sum+a;
            if(a>biger){
                biger=a;
            }
        }
        if (1.0*sum/2==biger){
            System.out.println("Yes");
            System.out.println("Sum = "+biger);
        }else {
            System.out.println("No");
            int dift=Math.abs(biger-(sum-biger));
            System.out.println("Diff = "+dift);
        }
    }
}
