import java.util.Scanner;
// created by J.M.
public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie=scan.nextLine();
        int count=1; int totalPoints=0; String bestMovie="";
        while(!movie.equals("STOP")){
            int n=movie.length();
            int points=0;
            for(int i=0; i<n; i++){
                int a=movie.charAt(i);
                if(a>64&&a<91){
                    a=a-n;
                }else if(a>96&&a<123){
                    a=a-(n*2);
                }
                points+=a;
            }
            if(points>totalPoints){
                totalPoints=points;
                bestMovie=movie;
            }
            if(count==7){
                System.out.println("The limit is reached.");
                break;
            }
            movie=scan.nextLine();
            count++;
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.",bestMovie,totalPoints);
    }
}
