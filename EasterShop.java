import java.util.Scanner;
// created by J.M.
public class EasterShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numEggs=Integer.parseInt(scan.nextLine());
        int sum=0;
        String command = scan.nextLine();
        int num;

        while(!command.equals("Close")){
            num=Integer.parseInt(scan.nextLine());
            if(numEggs<num&&command.equals("Buy")){
                break;
            }
            switch (command) {
                    case "Buy":  numEggs -= num; sum+=num; break;
                    case "Fill": numEggs += num; break;
                }
            command = scan.nextLine();
                if(command.equals("Close")){
                     break;
                }
        }
        if(command.equals("Close")){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",sum);
        }else{
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.",numEggs);
        }
    }
}
