import java.util.Scanner;
// created by J.M.
public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double incomeBGN = Double.parseDouble(scan.nextLine());
        double evaluation = Double.parseDouble(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());
        double SocialScholarship = Math.floor(salary * 0.35);
        double ScholarshipForExcellentResults = Math.floor(evaluation * 25);
        if (evaluation<4.5||evaluation<5.5&&incomeBGN>salary) {
            System.out.println("You cannot get a scholarship!");
        } else if (incomeBGN > salary && evaluation >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", ScholarshipForExcellentResults);
        } else if (incomeBGN < salary && evaluation < 5.5) {
            System.out.printf("You get a Social scholarship %.0f BGN", SocialScholarship);
        }  else if (incomeBGN < salary || evaluation >= 5.5) {
            if (SocialScholarship > ScholarshipForExcellentResults) {
                System.out.printf("You get a Social scholarship %.0f BGN", SocialScholarship);
            }else if (ScholarshipForExcellentResults >= SocialScholarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", ScholarshipForExcellentResults);
            }
        }
    }
}