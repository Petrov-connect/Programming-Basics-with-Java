import java.util.Scanner;
// created by J.M.
public class CarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int n1=Integer.parseInt(scan.nextLine());
        for(int i=n; i<=n1; i++){
            for(int j=n; j<=n1; j++){
                for(int k=n; k<=n1; k++){
                    for(int m=n; m<=n1; m++){
                        if (((i%2==0&&!(m%2==0))||(!(i%2==0)&&m%2==0))&&(i>m)&&((j+k)%2==0)){
                            System.out.printf("%d%d%d%d ",i,j,k,m);
                        }
                    }
                }
            }
        }
    }
}
