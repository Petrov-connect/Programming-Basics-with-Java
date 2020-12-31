import java.util.Scanner;

// created by J.M.
public class MovieRatings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double minRating = Double.MAX_VALUE;
        double maxRating = Double.MIN_VALUE;
        String maxMovie = "";
        String minMovie = "";
        double totalRating = 0;
        int numMovies = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= numMovies; i++) {
            String nameMovie = scan.nextLine();
            double rating = Double.parseDouble(scan.nextLine());
            if (rating < minRating) {
                minRating = rating;
                minMovie = nameMovie;
            }
            if (rating > maxRating) {
                maxRating = rating;
                maxMovie = nameMovie;
            }
            totalRating += rating;
        }
        System.out.printf("%s is with highest rating: %.1f%n", maxMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minMovie, minRating);
        System.out.printf("Average rating: %.1f", totalRating / numMovies);
    }
}
