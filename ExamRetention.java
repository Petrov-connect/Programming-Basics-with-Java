import java.util.Scanner;
// created by J.M.
public class ExamRetention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stud=Integer.parseInt(scan.nextLine());
        int season=Integer.parseInt(scan.nextLine());
        int count=0; boolean x=false;
        for(int i=1; i<=season; i++){
            count++;
            for(int j=1; j<=2; j++){
               stud= (int) Math.ceil(stud*0.9);
            }
            stud=(int) Math.ceil(stud*0.8);
            if(count%3==0){
                x=true;
            }if(x) {
                stud +=(int) Math.ceil(stud*0.15);
                x=false;
            }else{
                stud +=(int) Math.ceil(stud*0.05);
            }
        }
        System.out.printf("Students: %d",stud);
    }
}
