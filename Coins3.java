import java.util.Scanner;

// created by J.M.
public class Coins3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sum = Double.parseDouble(sc.nextLine());

        int coins = 0;
        int sumInt = (int) (sum * 100);
        int[] coinValue = {200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (sumInt > 0) {
            coins += sumInt / coinValue[i];
            sumInt = sumInt % coinValue[i];
            i++;
        }
        System.out.println(coins);
    }
}