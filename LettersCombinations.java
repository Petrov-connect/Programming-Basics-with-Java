import java.util.Scanner;

// created by J.M.
public class LettersCombinations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextLine().charAt(0);
        int a2 = scan.nextLine().charAt(0);
        int a3 = scan.nextLine().charAt(0);

        int count = 0;
        for (int i = a1; i <= a2; i++) {
            for (int j = a1; j <= a2; j++) {
                for (int k = a1; k <= a2; k++) {
                    if (!(i == a3) && !(j == a3) && !(k == a3)) {
                        char a = (char) i;
                        char b = (char) j;
                        char c = (char) k;
                        System.out.printf("%c%c%c ", a, b, c);
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
