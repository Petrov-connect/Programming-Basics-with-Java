import java.util.Scanner;
// created by J.M.
public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTournament=Integer.parseInt(scan.nextLine());
        int startPoints=Integer.parseInt(scan.nextLine());
        int points=0; int count=0;
        for(int i=1; i<=numTournament; i++){
            String text=scan.nextLine();
            switch (text){
                case"W": points+=2000; count++;break;
                case"F": points+=1200;break;
                case"SF": points+=720;break;
            }
        }
        double midPoints=Math.floor(1.0*points/numTournament);
        double percentWin=1.0*count/numTournament*100;
        System.out.printf("Final points: %d%n",startPoints+points);
        System.out.printf("Average points: %.0f%n",midPoints);
        System.out.printf("%.2f%%",percentWin);
    }
}
