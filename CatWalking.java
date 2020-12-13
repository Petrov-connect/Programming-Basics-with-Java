import java.util.Scanner;
// created by J.M.
public class CatWalking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minutes=Integer.parseInt(scan.nextLine());
        int perDay=Integer.parseInt(scan.nextLine());
        int calories=Integer.parseInt(scan.nextLine());
        int calForDay=(minutes*perDay)*5;
        if (calForDay<calories/2) {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",calForDay);
        }
        else if (calForDay>=calories/2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",calForDay);
        }
    }
}
