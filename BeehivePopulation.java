import java.util.Scanner;
// created by J.M.
public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int population=Integer.parseInt(scan.nextLine());
        int years=Integer.parseInt(scan.nextLine());
        double born,die;
        for(int i=1; i<=years; i++){
            born=Math.floor(1.0*population/10)*2;
            population+=born;
            if(i%5==0){
                die=Math.floor(1.0*population/50)*5;
                population-=die;
            }
            die=Math.floor(1.0*population/20)*2;
            population-=die;
        }
        System.out.printf("Beehive population: %d",population);
    }
}