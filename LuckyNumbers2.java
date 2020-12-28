import java.util.Scanner;
// created by J.M.
public class LuckyNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int m = 1; m <= 9; m++) {
                        if((i+j==k+m)&&n%(i+j)==0){
                            System.out.printf("%d%d%d%d ",i,j,k,m);
                        }
                    }
                }
            }
        }
    }
}