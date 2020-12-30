import java.util.Scanner;

// created by J.M.
public class ExamPoints {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int ex = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();

        double points = 0;
        switch (type) {
            case "Basics":
                if (num == 1) {
                    points = ex * (1.0 * 8 / 100) * 0.8;
                } else if (num == 2 || num == 3) {
                    points = ex * (1.0 * 9 / 100);
                } else if (num == 4) {
                    points = ex * (1.0 * 10 / 100);
                }
                break;
            case "Fundamentals":
                if (num == 1 || num == 2) {
                    points = ex * (1.0 * 11 / 100);
                } else if (num == 3) {
                    points = ex * (1.0 * 12 / 100);
                } else if (num == 4) {
                    points = ex * (1.0 * 13 / 100);
                }
                break;
            case "Advanced":
                if (num == 1 || num == 2) {
                    points = ex * (1.0 * 14 / 100);
                } else if (num == 3) {
                    points = ex * (1.0 * 15 / 100);
                } else if (num == 4) {
                    points = ex * (1.0 * 16 / 100);
                }
                points *= 1.2;
                break;
        }
        System.out.printf("Total points: %.2f", points);
    }
}
