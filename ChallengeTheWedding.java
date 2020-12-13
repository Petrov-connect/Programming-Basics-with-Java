import java.util.Scanner;
// created by J.M.
public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int t = Integer.parseInt(scan.nextLine());
        for(int i=1; i<=m; i++){
            for (int j=1; j<=w; j++){
                if (t==0)break;
                System.out.printf("(%d <-> %d) ",i,j);
                t--;
            }
        }
    }
}
