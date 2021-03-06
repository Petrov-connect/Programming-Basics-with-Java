import java.util.Scanner;

// created by J.M.
public class BakingCompetition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String nameOne;
        String nameTwo = "";
        double price = 0;
        int cooke = 0;
        int cake = 0;
        int waffle = 0;
        int sumBake = 0;
        for (int i = 1; i <= n; i++) {
            nameOne = scan.nextLine();
            while (!nameOne.equals("Stop baking!")) {

                String bake = scan.nextLine();
                if (bake.equals("Stop baking!")) {
                    break;
                }
                int num = Integer.parseInt(scan.nextLine());
                nameTwo = nameOne;
                switch (bake) {
                    case "cookies":
                        price += (num * 1.50);
                        cooke += num;
                        break;
                    case "cakes":
                        price += (num * 7.80);
                        cake += num;
                        break;
                    case "waffles":
                        price += (num * 2.30);
                        waffle += num;
                        break;
                }
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", nameTwo, cooke, cake, waffle);
            sumBake += (cooke + cake + waffle);
            cooke = 0;
            cake = 0;
            waffle = 0;
        }
        System.out.printf("All bakery sold: %d%n", sumBake);
        System.out.printf("Total sum for charity: %.2f lv.", price);
    }
}
