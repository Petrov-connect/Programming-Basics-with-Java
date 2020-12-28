import java.util.Scanner;
// created by J.M.
public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1=Integer.parseInt(scan.nextLine());
        int m2=Integer.parseInt(scan.nextLine());
        int b5=Integer.parseInt(scan.nextLine());
        int sum=Integer.parseInt(scan.nextLine());

        for(int i=0; i<=m1; i++){
            for(int j=0; j<=m2; j++){
                for(int k=0; k<=b5; k++){
                    if(i+j*2+k*5==sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);
                    }
                }
            }
        }
    }
}
