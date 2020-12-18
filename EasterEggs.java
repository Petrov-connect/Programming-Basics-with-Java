import java.util.Scanner;
// created by J.M.
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numEggs = Integer.parseInt(scan.nextLine());
        String color=""; int red=0; int orange=0; int blue=0; int green=0; int max=Integer.MIN_VALUE;
        for(int i=1; i<=numEggs; i++){
            color=scan.nextLine();
            switch(color){
                case"red": red++; break;
                case"orange": orange++; break;
                case"blue": blue++; break;
                case"green": green++; break;
            }
        }
        if(max<red){
            max=red; color="red";
        }
        if(max<=orange){
            max=orange; color="orange";
        }
        if(max<=blue){
            max=blue; color="blue";
        }
        if(max<=green){
            max=green; color="green";
        }
        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n",blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s",max,color);
    }
}
