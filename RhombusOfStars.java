import java.util.Scanner;
// created by J.M.
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String space = " ";
        String star = "* ";
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print(space);}
            for(int k=1; k<=i; k++){
            System.out.print(star);}
            System.out.println();
        }
        for (int j = n - 1; j >= 1; j--) {
            for(int i = 1; i<=n-j; i++){
                System.out.print(space);}
            for(int k =1; k<=j; k++){
                System.out.print(star);}
            System.out.println();
        }
    }
}
