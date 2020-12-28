import java.util.Scanner;
// created by J.M.
public class HighJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height=Integer.parseInt(scan.nextLine());
        int secondHeight=height-30; int count=0; int countFalse=0;
        while (!(countFalse==3)){
            int jump=Integer.parseInt(scan.nextLine());
            count++;
            if(jump>secondHeight){
                if(secondHeight>=height){
                    break;
                }
                secondHeight+=5;
                countFalse=0;
            }else{
                countFalse++;
            }
        }
        if(countFalse==3){
            System.out.printf("Tihomir failed at %dcm after %d jumps.",secondHeight,count);
        }else{
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",secondHeight,count);
        }
    }
}
