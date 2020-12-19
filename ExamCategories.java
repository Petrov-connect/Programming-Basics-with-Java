import java.util.Scanner;
// created by J.M.
public class ExamCategories {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dif=Integer.parseInt(scan.nextLine());
        int zav=Integer.parseInt(scan.nextLine());
        int paj=Integer.parseInt(scan.nextLine());
        String ex;
        if(dif>=80&&zav>=80&&paj>=8){
            ex ="Legacy";
        }else if(dif>=80&&zav<=10){
            ex ="Master";
        }else if (dif <= 10) {
            ex = "Elementary";
        }else if (dif <= 30 && paj <= 1) {
            ex = "Easy";
        }else if(zav>=50&&paj>=2){
            ex = "Hard";
        }else {
            ex = "Regular";
        }
        System.out.printf("%s",ex);
    }
}
