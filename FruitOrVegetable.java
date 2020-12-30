import java.util.Scanner;

// created by J.M.
public class FruitOrVegetable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if (text.equals("banana") || text.equals("apple") || text.equals("kiwi") || text.equals("cherry") || text.equals("lemon") || text.equals("grapes")) {
            System.out.println("fruit");
        } else if (text.equals("tomato") || text.equals("cucumber") || text.equals("pepper") || text.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}