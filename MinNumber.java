import java.util.Scanner;
// created by J.M.
public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i =1; i<=n; i++){
            int num = Integer.parseInt(scan.nextLine());
            if (num < min){
                min = num;
            }
        }
        System.out.printf("%d",min);
    }
}
