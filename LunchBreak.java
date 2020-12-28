import java.util.Scanner;
// created by J.M.
public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName=scan.nextLine();
        int episode=Integer.parseInt(scan.nextLine());
        int rest=Integer.parseInt(scan.nextLine());
        double lunch=rest*(1.0/8);
        double rest1=rest*(1.0/4);
        double totalRest=(rest-lunch-rest1);
        if(totalRest>=episode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movieName,Math.ceil(totalRest-episode));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movieName,Math.ceil(episode-totalRest));
        }
    }
}
