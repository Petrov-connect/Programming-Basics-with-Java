import java.util.Scanner;
// created by J.M.
public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName=scan.nextLine();
        int countSeason=Integer.parseInt(scan.nextLine());
        int countEpisodes=Integer.parseInt(scan.nextLine());
        double timeEpisode=Double.parseDouble(scan.nextLine());
        timeEpisode*=0.2;
        double totalTime=Math.floor(countSeason*countEpisodes*timeEpisode+countSeason*10);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",movieName,totalTime);
    }
}
