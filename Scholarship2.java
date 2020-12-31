import java.util.Scanner;

// created by J.M.
public class Scholarship2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double incomeBGN = Double.parseDouble(scan.nextLine());
        double evaluation = Double.parseDouble(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());

        double socSc = Math.floor(salary * 0.35);
        double exScore = 0.0;

        if (evaluation >= 5.5) {
            exScore = Math.floor(evaluation * 25);
        }
        if (exScore >= socSc || evaluation >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", exScore);
        } else if (evaluation > 4.5 && incomeBGN < salary) {
            System.out.printf("You get a Social scholarship %.0f BGN", socSc);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}