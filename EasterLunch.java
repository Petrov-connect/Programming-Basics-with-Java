import java.util.Scanner;
// created by J.M.
public class EasterLunch {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int kozunaci=Integer.parseInt(scan.nextLine());
            int kori=Integer.parseInt(scan.nextLine());
            int kurabii=Integer.parseInt(scan.nextLine());

            double kozunak=3.20; double kurabia=5.40; double kora=4.35; double boqegg=12*0.15;
            double price = kozunak*kozunaci+kori*kora+kori*boqegg+kurabii*kurabia;
        System.out.printf("%.2f",price);
    }
}
