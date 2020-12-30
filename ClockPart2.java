//created by J.M.
public class ClockPart2 {

    public static void main(String[] args) {
        for (int i =0; i<=23 ; i++){
            for(int a = 0; a<=59; a++){
                for(int b=0; b<=59; b++) {
                    System.out.printf("%d : %d : %d%n", i, a, b);
                }
            }
        }
    }
}
