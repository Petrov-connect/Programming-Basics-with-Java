import java.util.Scanner;

// created by J.M.
public class Coins2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sum = Double.parseDouble(sc.nextLine());

        int coins = 0;
        int sumInt = (int) (sum * 100);
        coins += sumInt / 200;
        sumInt = sumInt % 200;
        coins += sumInt / 100;
        sumInt = sumInt % 100;
        coins += sumInt / 50;
        sumInt = sumInt % 50;
        coins += sumInt / 20;
        sumInt = sumInt % 20;
        coins += sumInt / 10;
        sumInt = sumInt % 10;
        coins += sumInt / 5;
        sumInt = sumInt % 5;
        coins += sumInt / 2;
        sumInt = sumInt % 2;
        coins += sumInt % 2;

        System.out.println(coins);
    }
}