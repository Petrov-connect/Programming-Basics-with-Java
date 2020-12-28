import java.util.Scanner;
// created by J.M.
public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double full = p1*h+p2*h;
        double procFull= full/v*100;
        double procP1 = p1*h/full*100;
        double procP2 = p2*h/full*100;
        if (full>v){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,full-v);
        }else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",procFull,procP1,procP2);
        }
    }
}
