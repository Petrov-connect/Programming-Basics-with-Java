import java.util.Scanner;

// created by J.M.
public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hE = Integer.parseInt(scan.nextLine());
        int mE = Integer.parseInt(scan.nextLine());
        int hA = Integer.parseInt(scan.nextLine());
        int mA = Integer.parseInt(scan.nextLine());

        int h,m;

        if (hA > hE) {
            h = hA - hE;
            System.out.println("Late");
            if (mA >= mE) {
                m = mA - mE;
                System.out.printf("%d:%02d hours after the start", h, m);
            } else {
                m = (60 - mE) + mA;
                if ((h - 1) > 0) {
                    System.out.printf("%d:%02d hours after the start", h - 1, m);
                } else {
                    System.out.printf("%d minutes after the start", m);
                }
            }
        } else if (hE > hA) {
            h = hE - hA;
            if ((h - 1) > 0) {
                System.out.println("Early");
                if (mA > mE) {
                    m = (60 - mA) + mE;
                    System.out.printf("%d:%02d hours before the start", h - 1, m);
                } else {
                    m = ((60 - mA) + mE) - 60;
                    System.out.printf("%d:%02d hours before the start", h, m);
                }

            } else {
                if (mE >= mA) {
                    m = ((60 - mA) + mE) - 60;
                    System.out.println("Early");
                    System.out.printf("%d:%02d hours before the start", h, m);
                } else {
                    m = (60 - mA) + mE;
                    if (m > 30) {
                        System.out.println("Early");
                    } else {

                        System.out.println("On time");
                    }
                    System.out.printf("%d minutes before the start", m);
                }
            }
        } else {
            if (mA > mE) {
                m = mA - mE;
                System.out.println("Late");
                System.out.printf("%2d minutes after the start", m);

            } else if (mE > mA) {
                m = mE - mA;
                if (m > 30) {
                    System.out.println("Early");
                } else {
                    System.out.println("On time");
                }
                System.out.printf("%d minutes before the start", m);
            } else {
                System.out.println("On time");
            }
        }
    }
}