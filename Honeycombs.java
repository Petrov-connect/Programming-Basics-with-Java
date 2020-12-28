import java.util.Scanner;
// created by J.M.
public class Honeycombs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bees=Integer.parseInt(scan.nextLine());
        int flowers=Integer.parseInt(scan.nextLine());
        double honeycomb=bees*0.21*flowers;
        System.out.printf("%.0f honeycombs filled.%n",Math.floor(honeycomb/100));
        System.out.printf("%.2f grams of honey left.",honeycomb%100);
    }
}
