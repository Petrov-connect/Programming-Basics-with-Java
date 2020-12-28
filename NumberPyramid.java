import java.util.Scanner;
// created by J.M.
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean x = false; int count=1;
        int n = Integer.parseInt(scan.nextLine());
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(count>n){
                    x = true;
                    break;
                }
                System.out.print(count+" ");
                count++;
            }
            if(x){
                break;
            }
            System.out.println();
        }
    }
}
