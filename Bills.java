import java.util.Scanner;
// created by J.M.
public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monts = Integer.parseInt(scan.nextLine());
        double totalEnergy=0; double totalWoter=0; double totalinternet=0; double totalOders=0;
        for(int i = 1; i <=monts; i++){
            double price=Double.parseDouble(scan.nextLine());
            totalEnergy+=price;
            totalWoter+=20.0;
            totalinternet+=15.0;
            totalOders+=((20+15+price)*1.2);
        }
        double totalprice=(totalEnergy+totalWoter+totalinternet+totalOders)/monts;
        System.out.printf("Electricity: %.2f lv%n",totalEnergy);
        System.out.printf("Water: %.2f lv%n",totalWoter);
        System.out.printf("Internet: %.2f lv%n",totalinternet);
        System.out.printf("Other: %.2f lv%n",totalOders);
        System.out.printf("Average: %.2f lv",totalprice);
    }
}
