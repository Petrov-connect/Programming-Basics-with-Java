import java.util.Scanner;
// created by J.M.
public class PCGameShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfGame=Integer.parseInt(scan.nextLine());
        int countHearthstone=0;int countFornite=0;int countOverwatch=0;int countOthers=0;
        for(int i=1; i<=numOfGame; i++){
            String text=scan.nextLine();
            switch (text){
                case"Hearthstone":countHearthstone++; break;
                case"Fornite":countFornite++; break;
                case"Overwatch":countOverwatch++; break;
                default: countOthers++; break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n",1.0*countHearthstone/numOfGame*100);
        System.out.printf("Fornite - %.2f%%%n",1.0*countFornite/numOfGame*100);
        System.out.printf("Overwatch - %.2f%%%n",1.0*countOverwatch/numOfGame*100);
        System.out.printf("Others - %.2f%%",1.0*countOthers/numOfGame*100);
    }
}
