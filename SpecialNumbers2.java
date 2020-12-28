import java.util.Scanner;
// created by J.M.
public class SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int specialDigit = Integer.parseInt(scanner.nextLine());
        for (int currentNumber = 1111; currentNumber < 9999; currentNumber++) {
            String copyNum = currentNumber + "";
            boolean isSpecial = true;
            for (int i = 0; i < copyNum.length(); i++) {
                char currentDigit = copyNum.charAt(i);
                int digitAsInteger = Integer.parseInt(currentDigit + "");
                if(digitAsInteger == 0){
                    isSpecial = false;
                    break;
                }
                if(specialDigit % digitAsInteger != 0){
                    isSpecial = false;
                    break;
                }
            }
            if(isSpecial){
                System.out.print(currentNumber+ " ");
            }
        }
    }
}