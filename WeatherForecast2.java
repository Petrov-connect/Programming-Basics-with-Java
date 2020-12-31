import java.util.Scanner;

// created by J.M.
public class WeatherForecast2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double temp = Double.parseDouble(scan.nextLine());

        if (temp >= 26.0 & temp <= 35.0) {
            System.out.println("Hot");
        } else if (temp <= 26.0 & temp > 20.0) {
            System.out.println("Warm");
        } else if (temp >= 15.0 & temp <= 20.0) {
            System.out.println("Mild");
        } else if (temp >= 12.0 & temp < 15.0) {
            System.out.println("Cool");
        } else if (temp >= 5.0 & temp < 12.0) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
