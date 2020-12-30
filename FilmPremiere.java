import java.util.Scanner;

// created by J.M.
public class FilmPremiere {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String movie=scan.nextLine();
        String packet=scan.nextLine();
        int tickets=Integer.parseInt(scan.nextLine());

        double price=0;

        switch(movie){
            case"John Wick":
                switch (packet){
                    case"Drink":   price=12.00; break;
                    case"Popcorn": price=15.00; break;
                    case"Menu":    price=19.00; break;
                }
                break;
            case"Star Wars":
                switch (packet){
                    case"Drink":   price=18.00; break;
                    case"Popcorn": price=25.00; break;
                    case"Menu":    price=30.00; break;
                }
                if(tickets>=4){
                    price*=0.7;
                }
                break;
            case"Jumanji":
                switch (packet){
                    case"Drink":   price=9.00; break;
                    case"Popcorn": price=11.00; break;
                    case"Menu":    price=14.00; break;
                }
                if(tickets==2){
                    price*=0.85;
                }
                break;
        }
        System.out.printf("Your bill is %.2f leva.",tickets*price);
    }
}
