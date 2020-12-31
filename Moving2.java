import java.util.Scanner;

// created by J.M.
public class Moving2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int leftCapacity = width * length * height;
        int numBox;

        while (leftCapacity > 0) {
            String n = scan.nextLine();
            if (n.equals("Done")) {
                System.out.printf("%d Cubic meters left.", leftCapacity);
                break;
            } else {
                numBox = Integer.parseInt(n);
                leftCapacity -= numBox;
            }
        }
        if (leftCapacity < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(leftCapacity));
        }
    }
}