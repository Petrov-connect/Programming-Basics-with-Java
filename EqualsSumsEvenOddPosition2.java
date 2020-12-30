import java.util.Scanner;

// created by J.M.
public class EqualsSumsEvenOddPosition2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int copyNumber = i;
            boolean isEvenPosition = true;
            while (copyNumber > 0) {
                int currentDigit = copyNumber % 10;
                copyNumber = copyNumber / 10;
                if (isEvenPosition) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
                isEvenPosition = !isEvenPosition;
            }
            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }

        }
    }
}