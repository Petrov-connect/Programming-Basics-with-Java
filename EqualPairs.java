import java.util.Scanner;
// created by J.M.
public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int     counter  = Integer.parseInt(sc.nextLine());
        int     a;
        int     b;
        int     sum      = 0;
        int     prevSum  = 0;
        int     diff;
        int     prevDiff = 0;
        int     maxDiff  = 0;

        for (int i = 1; i <= counter; i++) {
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            sum = a + b;

            if ( i > 1 ) {
                diff = prevSum - sum;
                prevSum = sum;
                if ( diff != 0 ) {
                    if ( Math.abs(diff) > Math.abs(prevDiff) ) {
                        maxDiff = Math.abs(diff);
                    }
                }
                prevDiff = diff;
            }
            else{
                prevSum=sum;
            }
        }
        if ( maxDiff==0 ){
            System.out.printf("Yes, value=%d",sum);
        }
        else{
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
    }
}