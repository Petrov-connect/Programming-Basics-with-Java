import java.util.Scanner;
// created by J.M.
public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        String destination; double total =0; String place="";
        if(budget<=100){
            destination="Bulgaria";
            switch(season){
                case"summer":
                    place="Camp"; total=budget*0.3;
                    break;
                case"winter":
                    place="Hotel"; total=budget*0.7;
                    break;
            }
        }else if(budget<=1000){
            destination="Balkans";
            switch(season){
                case"summer":
                    place="Camp"; total=budget*0.4;
                    break;
                case"winter":
                    place="Hotel"; total=budget*0.8;
                    break;
            }
        }else{
            destination="Europe"; place="Hotel"; total=budget*0.9;
        }

        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",place,total);
    }
}