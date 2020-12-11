import java.util.Scanner;
// created by J.M.
public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monts = Integer.parseInt(scan.nextLine());
        double totaltok=0; double totalvoda=0; double totalinternet=0; double totaldrugi=0;
        for(int i = 1; i <=monts; i++){
            double price=Double.parseDouble(scan.nextLine());
            totaltok+=price;
            totalvoda+=20.0;
            totalinternet+=15.0;
            totaldrugi+=((20+15+price)*1.2);
        }
        double totalprice=(totaltok+totalvoda+totalinternet+totaldrugi)/monts;
        System.out.printf("Electricity: %.2f lv%n",totaltok);
        System.out.printf("Water: %.2f lv%n",totalvoda);
        System.out.printf("Internet: %.2f lv%n",totalinternet);
        System.out.printf("Other: %.2f lv%n",totaldrugi);
        System.out.printf("Average: %.2f lv",totalprice);
    }
}
