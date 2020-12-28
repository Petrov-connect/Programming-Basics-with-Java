import java.util.Scanner;
// created by J.M.
public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int count = 0;
        while(!text.equals("Stop")){
            text = scan.nextLine();
            count++;
        }
        System.out.printf("%d",count);
    }
}
