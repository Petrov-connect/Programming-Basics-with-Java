import java.util.Scanner;

// created by J.M.
public class FootballLeague {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int stadium =Integer.parseInt(scan.nextLine());
        int fens = Integer.parseInt(scan.nextLine());

        int A = 0;
        int B = 0;
        int V = 0;
        int G = 0;

        for(int i = 1; i<=fens; i++){
            char sector = scan.nextLine().charAt(0);
            switch(sector){
                case'A': A++; break;
                case'B': B++; break;
                case'V': V++; break;
                case'G': G++; break;
            }
        }
        double procA= 1.0*A/fens*100;
        double procB= 1.0*B/fens*100;
        double procV= 1.0*V/fens*100;
        double procG= 1.0*G/fens*100;
        double procAll=1.0*fens/stadium*100;

        System.out.printf("%.2f%%%n",procA);
        System.out.printf("%.2f%%%n",procB);
        System.out.printf("%.2f%%%n",procV);
        System.out.printf("%.2f%%%n",procG);
        System.out.printf("%.2f%%",procAll);
    }
}
