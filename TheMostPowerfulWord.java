import java.util.Scanner;
// created by J.M.
public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalSum=0; String winner="";
        String text=scan.nextLine();
        while (!text.equals("End of words")){
            int length=text.length();
            double sum=0;
            for(int i=0; i<length; i++){
                int num=text.charAt(i);
                sum+=num;
            }
            char b=text.charAt(0);
            if(b=='a'||b=='A'||b=='e'||b=='E'||b=='o'||b=='O'||b=='u'||b=='U'||b=='i'||b=='I'||b=='y'||b=='Y'){
                sum*=length;
            }else{
                sum=Math.floor(1.0*sum/length);
            }if(sum>totalSum){
                totalSum=sum; winner=text;
            }
            text=scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",winner,totalSum);
    }
}
