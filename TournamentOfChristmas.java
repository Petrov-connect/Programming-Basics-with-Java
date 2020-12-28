import java.util.Scanner;
// created by J.M.
public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double totalSum = 0.0;  int daysWin=0; int daysLose=0; double daysSum =0.0;int win=0; int lose=0;
        for(int i = 1; i <=days; i++) {

            while (true) {
                String sport = scan.nextLine();
                if (sport.equals("Finish")) {
                    if(win>lose){
                        daysSum*=1.1; daysWin++;
                    }else {
                        daysLose++;
                    }
                    totalSum+=daysSum;
                    daysSum=0; win=0;lose=0;
                    break;
                }
                String code = scan.nextLine();
                if (code.equals("win")) {
                    daysSum += 20.00;
                    win++;
                }else {
                    lose++;
                }
            }
        }
        if(daysWin>daysLose){
            totalSum*=1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",totalSum);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",totalSum);
        }
    }
}
