import java.util.Scanner;
// created by J.M.
public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count1=Integer.parseInt(scan.nextLine());
        int count2=Integer.parseInt(scan.nextLine());
        boolean x = true;
        String text=scan.nextLine();
        while(!text.equals("End of battle")){
            switch (text){
                case"one": count2--; break;
                case"two": count1--; break;
            }
            if(count1==0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",count2);
                x=false; break;
            }else if(count2==0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",count1);
                x=false; break;
            }else{
                text = scan.nextLine();
            }
        }
        if(x){
            System.out.printf("Player one has %d eggs left.%n",count1);
            System.out.printf("Player two has %d eggs left.",count2);
        }
    }
}
