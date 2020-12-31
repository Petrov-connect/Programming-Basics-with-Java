import java.util.Scanner;

// created by J.M.
public class OscarsWeekInCinema {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String movieName=scan.nextLine();
        String typeHall=scan.nextLine();
        int countTickets=Integer.parseInt(scan.nextLine());

        double price=0;

        switch(movieName){
            case"A Star Is Born":
                switch (typeHall){
                    case"normal": price=7.50; break;
                    case"luxury": price=10.50; break;
                    case"ultra luxury": price=13.50; break;
                }
                break;
            case"Bohemian Rhapsody":
                switch (typeHall){
                    case"normal": price=7.35; break;
                    case"luxury": price=9.45; break;
                    case"ultra luxury": price=12.75; break;
                }
                break;
            case"Green Book":
                switch (typeHall){
                    case"normal": price=8.15; break;
                    case"luxury": price=10.25; break;
                    case"ultra luxury": price=13.25; break;
                }
                break;
            case"The Favourite":
                switch (typeHall){
                    case"normal": price=8.75; break;
                    case"luxury": price=11.55; break;
                    case"ultra luxury": price=13.95; break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.",movieName,price*countTickets);
    }
}
