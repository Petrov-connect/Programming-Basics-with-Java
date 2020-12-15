import java.util.Scanner;
// created by Joro Manekena
public class CruiseGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int games = Integer.parseInt(scan.nextLine());
        String nameGames; int points;
        double sumVoll=0; double sumTenis=0; double sumBadm=0; int vole=0;int tenis=0;int badm=0;
        for(int i = 1; i<=games; i++){
            nameGames = scan.nextLine();
            points = Integer.parseInt(scan.nextLine());
            switch(nameGames){
                case"volleyball": sumVoll+=points*1.07; vole++; break;
                case"tennis": sumTenis+=points*1.05; tenis++; break;
                case"badminton": sumBadm+=points*1.02; badm++; break;
            }
        }
        double total=Math.floor(sumVoll+sumBadm+sumTenis);

        sumVoll = (sumVoll/vole);
        sumTenis = (sumTenis/tenis);
        sumBadm = (sumBadm/badm);


        if (sumVoll>=75&&sumTenis>=75&&sumBadm>=75){
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.",name,total);
        }else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.",name,total);
        }
    }
}
