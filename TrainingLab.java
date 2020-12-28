import java.util.Scanner;
// created by J.M.
public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double widht = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double count = Math.floor(((((height*100)-100)/70) * ((widht*100)/120))-3);
        System.out.printf("%.0f",count);
    }
}
