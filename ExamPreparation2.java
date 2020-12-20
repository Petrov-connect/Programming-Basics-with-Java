import java.util.Scanner;

// created by J.M.
public class ExamPreparation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stud = Integer.parseInt(scan.nextLine());
        int ex = Integer.parseInt(scan.nextLine());
        int eng = Integer.parseInt(scan.nextLine());
        int cues=0; int totalEx=0;
        while(eng>0){
            for(int i=1; i<=ex; i++){
                eng+=2;
                totalEx+=1;
                stud-=1;
            }
            for(int i=1; i<=stud*2; i++){
                eng-=3;
                cues+=1;
            }
            if(eng<=0){
                System.out.println("The trainer is too tired!");
                System.out.printf("Questions asked: %d",cues);
                break;
            }
            if(stud<10){
                System.out.println("The students are too few!");
                System.out.printf("Problems solved: %d",totalEx);
                break;
            }else{
                stud=stud+stud/10;
            }
        }
    }
}
