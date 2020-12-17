import java.util.Scanner;
// created by J.M.
public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tournament=scan.nextLine();
        int count=0; int countWin=0; int countLost=0; int countN=0;
        while (!tournament.equals("End of tournaments")){
            int n=Integer.parseInt(scan.nextLine());
            countN+=n;
            for(int i=1; i<=n; i++){
                int teamOne=Integer.parseInt(scan.nextLine());
                int teamTwo=Integer.parseInt(scan.nextLine());
                count++;
                if(teamOne>teamTwo){
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",count,tournament,teamOne-teamTwo);
                    countWin++;
                }else{
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",count,tournament,teamTwo-teamOne);
                    countLost++;
                }
            }
            count=0;
            tournament=scan.nextLine();
        }
        System.out.printf("%.2f%% matches win%n",(1.0*countWin/countN*100));
        System.out.printf("%.2f%% matches lost",(1.0*countLost/countN*100));
    }
}
