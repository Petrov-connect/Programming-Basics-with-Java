import java.util.Scanner;
// created by J.M.
public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1=scan.nextLine();
        String player2=scan.nextLine();
        int points1=0; int points2=0; boolean war=true;
        String text=scan.nextLine();
        while(!text.equals("End of game")){
            int card1=Integer.parseInt(text);
            int card2=Integer.parseInt(scan.nextLine());
            if(card1>card2){
               points1+=(card1-card2);
            }else if(card2>card1){
                points2+=(card2-card1);
            }else{
                 card1=Integer.parseInt(scan.nextLine());
                 card2=Integer.parseInt(scan.nextLine());
                 System.out.println("Number wars!");
                if(card1>card2){
                    System.out.printf("%s is winner with %d points",player1,points1);
                 }else{
                    System.out.printf("%s is winner with %d points",player2,points2);
                 }
                 war=false; break;
            }
            text=scan.nextLine();
        }
        if(war){
            System.out.printf("%s has %d points%n",player1,points1);
            System.out.printf("%s has %d points",player2,points2);
        }
    }
}
