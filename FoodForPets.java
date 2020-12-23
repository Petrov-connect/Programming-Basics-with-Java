import java.util.Scanner;
// created by J.M.
public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double days = Integer.parseInt(scan.nextLine());
        double food = Double.parseDouble(scan.nextLine());
        double dogFood; double sumDogFood = 0; double catFood; double sumCatFood = 0; double biscuits = 0; double sumFood = 0;
        for (int i = 1; i <= days; i++){
            dogFood = Integer.parseInt(scan.nextLine());
            catFood = Integer.parseInt(scan.nextLine());
            sumDogFood +=dogFood;
            sumCatFood +=catFood;
            sumFood +=(dogFood+catFood);
            if (i % 3 == 0){
                biscuits += (dogFood+catFood)*0.1;
            }
        }
        biscuits = Math.round(biscuits);
        sumDogFood = (sumDogFood/sumFood)*100;
        sumCatFood = (sumCatFood/sumFood)*100;
        sumFood = (sumFood/food)*100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", sumFood);
        System.out.printf("%.2f%% eaten from the dog.%n",sumDogFood);
        System.out.printf("%.2f%% eaten from the cat.%n",sumCatFood);
    }
}
