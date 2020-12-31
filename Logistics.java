import java.util.Scanner;

// created by J.M.
public class Logistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        double totalTon = 0;
        int tonBus = 0;
        int tonTruck = 0;
        int tonTrain = 0;
        for (int i = 1; i <= count; i++) {
            int ton = Integer.parseInt(scan.nextLine());
            totalTon += ton;
            if (ton <= 3) {
                tonBus += ton;
            } else if (ton <= 11) {
                tonTruck += ton;
            } else {
                tonTrain += ton;
            }
        }
        double price = (tonBus * 200 + tonTruck * 175 + tonTrain * 120) / totalTon;
        double percentBus = tonBus / totalTon * 100;
        double percentTruck = tonTruck / totalTon * 100;
        double percentTrain = tonTrain / totalTon * 100;

        System.out.printf("%.2f%n", price);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%", percentTrain);
    }
}
