import java.util.Scanner;
// created by J.M.
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum=0; int rightSum=0;
        for (int left=1; left<=n; left++){
            leftSum += scan.nextInt();
        }for(int right=1; right<=n; right++) {
            rightSum += scan.nextInt();
        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else {
            System.out.printf("No, diff = %d",Math.abs(leftSum-rightSum));
        }
    }
}
