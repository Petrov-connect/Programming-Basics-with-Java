import java.util.Scanner;
// created by J.M.
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int student=0; int standard=0; int kid=0; int tickets=0;
        String movie = scan.nextLine();
        while(!movie.equals("Finish")){
            int places = Integer.parseInt(scan.nextLine());
            for (int i = places; i>=1; i--){
                String text = scan.nextLine();
                if ("student".equals(text)) { student++; }
                else if ("standard".equals(text)) { standard++; }
                else if ("kid".equals(text)) { kid++; }
                else { break; }
                    tickets++;
            }
            System.out.printf("%s - %.2f%% full.%n",movie,(1.0*tickets/places*100));
            tickets=0;  movie = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n",student+standard+kid);
        System.out.printf("%.2f%% student tickets.%n",(1.0*student/(student+standard+kid)*100));
        System.out.printf("%.2f%% standard tickets.%n",(1.0*standard/(student+standard+kid)*100));
        System.out.printf("%.2f%% kids tickets.",(1.0*kid/(student+standard+kid)*100));
    }
}
