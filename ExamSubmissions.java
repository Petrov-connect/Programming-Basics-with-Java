import java.util.Scanner;
// created by J.M.
public class ExamSubmissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int st=Integer.parseInt(scan.nextLine());
        int ex=Integer.parseInt(scan.nextLine());
        int sub= (int) (st*Math.ceil(ex*2.8)+(st*(ex/3)));
        int kb= (int) (5*Math.ceil(1.0*sub/10));
        System.out.printf("%d KB needed%n",kb);
        System.out.printf("%d submissions",sub);
    }
}
