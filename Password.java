import java.util.Scanner;
// created by J.M.
public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();
        String newpass = scan.nextLine();
        while(!newpass.equals(pass)){
            newpass=scan.nextLine();
        }
        System.out.printf("Welcome %s!",user);
    }
}
