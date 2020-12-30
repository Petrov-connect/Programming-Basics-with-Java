import java.util.Scanner;

// created by J.M.
public class Grades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        int stud5 = 0;
        int stud4 = 0;
        int stud3 = 0;
        int stud2 = 0;
        double totalGrade = 0;

        for (int i = 1; i <= count; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            totalGrade += grade;
            if (grade >= 5) {
                stud5 += 1;
            } else if (grade >= 4) {
                stud4 += 1;
            } else if (grade >= 3) {
                stud3 += 1;
            } else {
                stud2 += 1;
            }
        }
        totalGrade /= count;
        double percentStud5 = 1.0 * stud5 / count * 100;
        double percentStud4 = 1.0 * stud4 / count * 100;
        double percentStud3 = 1.0 * stud3 / count * 100;
        double percentStud2 = 1.0 * stud2 / count * 100;

        System.out.printf("Top students: %.2f%%%n", percentStud5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentStud4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentStud3);
        System.out.printf("Fail: %.2f%%%n", percentStud2);
        System.out.printf("Average: %.2f", totalGrade);
    }
}
