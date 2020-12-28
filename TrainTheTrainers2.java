import java.util.Scanner;
// created by J.M.
public class TrainTheTrainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfJudges = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double finalAssessment = 0;
        int countOfCourses = 0;
        while(!input.equals("Finish")){
            countOfCourses++;
            double resultsForThisCourse = 0;
            for (int currentJudge = 0; currentJudge < numberOfJudges; currentJudge++) {
                double currentMark = Double.parseDouble(scanner.nextLine());
                resultsForThisCourse+= currentMark;
            }
            double averageResultForThisCourse = resultsForThisCourse / numberOfJudges;
            finalAssessment+= averageResultForThisCourse;
            System.out.printf("%s - %.2f.%n", input, averageResultForThisCourse);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalAssessment/countOfCourses);
    }
}