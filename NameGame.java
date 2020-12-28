import java.util.Scanner;
// created by J.M.
public class NameGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text=scan.nextLine();
        int totalPoints=0; int total=0; String winner=""; int points = 0;
        while(!text.equals("Stop")){
            int length=text.length();
            for(int i=0; i<length; i++) {
                int num = Integer.parseInt(scan.nextLine());
                int num2 = text.charAt(i);
                if (num == num2) {
                    points += 10;
                } else {
                    points += 2;
                }
                total += points; points=0;
            }
            if(total>=totalPoints){
                totalPoints=total;
                winner=text;
            }
            total=0;
            text=scan.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",winner,totalPoints);
    }
}
