import java.util.Scanner;

// created by J.M.
public class TradeCommissions1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double vol = Double.parseDouble(sc.nextLine());

        double com = 0.0;

        if (vol >= 0 && vol <= 500) {
            switch (city) {
                case "Sofia": com += 0.05;break;
                case "Varna": com += 0.045;break;
                case "Plovdiv": com += 0.055;break;
                default: com = 0.0;
            }
        } else if (vol > 500 && vol <= 1000) {
            switch (city) {
                case "Sofia": com += 0.07;break;
                case "Varna": com += 0.075;break;
                case "Plovdiv": com += 0.08;break;
                default: com = 0.0;
            }
        } else if (vol > 1000 && vol <= 10000) {
            switch (city) {
                case "Sofia": com += 0.08;break;
                case "Varna": com += 0.1;break;
                case "Plovdiv": com += 0.12;break;
                default: com = 0.0;
            }
        } else if (vol > 10000) {
            switch (city) {
                case "Sofia": com += 0.12;break;
                case "Varna": com += 0.13;break;
                case "Plovdiv": com += 0.145;break;
                default: com = 0.0;
            }
        } else {
            com = 0.0;
        }
        if (com > 0) {
            System.out.printf("%.2f", com * vol);
        } else {
            System.out.println("error");
        }
    }
}
