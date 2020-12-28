import java.util.Scanner;
// created by J.M.
public class Scholarship4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = Double.parseDouble(scan.nextLine());
        double evalua = Double.parseDouble(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());
        double social = 0.0;
        double excell = 0.0;
        if (evalua>=5.5) {
            excell = Math.floor(evalua * 25);
        }
        else if (evalua>4.5) {
            if (salary > income) {
                social = Math.floor(salary * 0.35);
            }
        }
        if (excell>social){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",excell);
        }
        else if (social>excell){
            System.out.printf("You get a Social scholarship %.0f BGN",social);
        }
        else  {
            System.out.println("You cannot get a scholarship!");
        }
    }
}