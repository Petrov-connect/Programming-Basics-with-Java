import java.util.Scanner;
// created by J.M.
public class DartsTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startPoints = Integer.parseInt(scan.nextLine());
        int points; String sector=""; int count=0;
        while(startPoints>0){
            count++;
            sector = scan.nextLine();
            if ("bullseye".equals(sector)) {
                break;
            }
                points = Integer.parseInt(scan.nextLine());
            if ("triple ring".equals(sector)) {
                points *= 3;
            } else if ("double ring".equals(sector)) {
                points *= 2;
            }
            startPoints-=points;
        }
        if("bullseye".equals(sector)){
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!",count);
        }else if(startPoints==0){
            System.out.printf("Congratulations! You won the game in %d moves!",count);
        }else {
            System.out.printf("Sorry, you lost. Score difference: %d.",Math.abs(startPoints));
        }
    }
}
