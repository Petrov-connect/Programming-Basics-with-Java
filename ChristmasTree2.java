import java.util.Scanner;
// created by J.M.
public class ChristmasTree2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String space=" ".repeat(n);
        String l=" | ";
        System.out.println(space+l+space);
        for(int i=1; i<=n; i++){
            space =" ".repeat(n-i);
            String star="*".repeat(i);
            System.out.println(space+star+l+star);
        }
    }
}
