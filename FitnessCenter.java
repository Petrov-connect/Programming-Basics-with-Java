import java.util.Scanner;
// created by J.M.
public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int clients=Integer.parseInt(scan.nextLine());
        int back=0;int chest=0;int legs=0;int abs=0;int shake=0;int bar=0;
        for(int i=1; i<=clients; i++){
            String text=scan.nextLine();
            switch (text){
                case"Back":          back++;  break;
                case"Chest":         chest++; break;
                case"Legs":          legs++;  break;
                case"Abs":           abs++;   break;
                case"Protein shake": shake++; break;
                case"Protein bar":   bar++;   break;
            }
        }
        double percentF=(1.0*back+chest+legs+abs)/clients*100;
        double percentP=(1.0*shake+bar)/clients*100;
        System.out.printf("%d - back%n",back);
        System.out.printf("%d - chest%n",chest);
        System.out.printf("%d - legs%n",legs);
        System.out.printf("%d - abs%n",abs);
        System.out.printf("%d - protein shake%n",shake);
        System.out.printf("%d - protein bar%n",bar);
        System.out.printf("%.2f%% - work out%n",percentF);
        System.out.printf("%.2f%% - protein",percentP);
    }
}
