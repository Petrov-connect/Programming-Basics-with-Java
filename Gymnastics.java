import java.util.Scanner;

// created by J.M.
public class Gymnastics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String country=scan.nextLine();
        String device = scan.nextLine();

        double evaluation=0;

        switch(country){
            case"Russia":
                switch (device){
                    case"ribbon":evaluation=9.1+9.4;break;
                    case"hoop":evaluation=9.3+9.8;  break;
                    case"rope":evaluation=9.6+9;    break;
                }
                break;
            case"Bulgaria":
                switch (device){
                    case"ribbon":evaluation=9.6+9.4;  break;
                    case"hoop":evaluation=9.550+9.750;break;
                    case"rope":evaluation=9.5+9.4;    break;
                }
                break;
            case"Italy":
                switch (device){
                    case"ribbon":evaluation=9.2+9.5;  break;
                    case"hoop":evaluation=9.450+9.350;break;
                    case"rope":evaluation=9.7+9.150;  break;
                }
                break;
        }
        double percent=(20-evaluation)/20*100;

        System.out.printf("The team of %s get %.3f on %s.%n",country,evaluation,device);
        System.out.printf("%.2f%%",percent);
    }
}
