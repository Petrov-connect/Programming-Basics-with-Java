import java.util.Scanner;
// created by J.M.
public class SumNumbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =0;
        String text = scan.nextLine();
        while(!text.equals("Stop")){
            int n = Integer.parseInt(text);
            sum +=n;
            text = scan.nextLine();
        }
        System.out.printf("%d",sum);
    }
}
