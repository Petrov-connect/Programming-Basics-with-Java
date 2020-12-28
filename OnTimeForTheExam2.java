import java.util.Scanner;
// created by J.M.
public class OnTimeForTheExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hE = Integer.parseInt(scan.nextLine());
        int mE = Integer.parseInt(scan.nextLine());
        int hA = Integer.parseInt(scan.nextLine());
        int mA = Integer.parseInt(scan.nextLine());
        int har; int hex; int late; int lateH; int lateM;
        if (hE > 0) {
            hex = hE * 60 + mE;
        } else {
            hex = mE;
        }
        if (hA > 0) {
            har = hA * 60 + mA;
        } else {
            har = mA;
        }
        if (har > hex) {
            late = har - hex;
            System.out.println("Late");
            if (late < 60) {
                System.out.printf("%d minutes after the start", late);
            } else {
                lateH = late / 60;
                lateM = late % 60;
                System.out.printf("%d:%02d hours after the start", lateH, lateM);
            }
        } else if (hex > har) {
            late = hex - har;
            if (late > 30 && late < 60) {
                System.out.println("Early");
                System.out.printf("%02d minutes before the start", late);
            } else if (late >= 60) {
                lateH = late / 60;
                lateM = late % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", lateH, lateM);
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", late);
            }

        } else {
            System.out.println("On time");
        }
    }
}
