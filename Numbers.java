import java.util.Scanner;
// created by J.M.
public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());

        for(int a = i; a>=1 ; a--){
            System.out.println(a);
        }
    }
}
