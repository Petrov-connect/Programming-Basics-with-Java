import java.util.Scanner;
// created by J.M.
public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent=Integer.parseInt(scan.nextLine());
        double statue=rent*0.7;
        double catering=statue*0.85;
        double sound=catering/2;
        System.out.printf("%.2f",rent+statue+catering+sound);
    }
}
