import java.util.Scanner;
// created by J.M.
public class Cinema2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=Integer.parseInt(scan.nextLine());
        int total=0;
        String people=scan.nextLine();
        while(!people.equals("Movie time!")){
            int num=Integer.parseInt(people);
            count-=num;
            if(count<0){
                System.out.println("The cinema is full.");
                break;
            }
            total+=num*5;
            if(num%3==0){
                total-=5;
            }
            people=scan.nextLine();
        }
        if(people.equals("Movie time!")){
            System.out.printf("There are %d seats left in the cinema.%n",count);
        }
        System.out.printf("Cinema income - %d lv.",total);
    }
}
