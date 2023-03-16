package TestExam3;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        int totalFoodEatenDog = 0;
        int totalFoodEatenCat = 0;
        double biscuit = 0;
        double totalFoodEaten = 0;

        for (int i = 1; i <= days; i++) {
            int foodEatenFromDog = Integer.parseInt(scanner.nextLine());
            int foodEatenFromCat = Integer.parseInt(scanner.nextLine());
            totalFoodEatenDog += foodEatenFromDog;
            totalFoodEatenCat += foodEatenFromCat;

            // Calculate biscuits
            if (i % 3 == 0){
                biscuit += (foodEatenFromDog + foodEatenFromCat) * 0.10;
            }

            totalFoodEaten += foodEatenFromDog + foodEatenFromCat;
        }

        // Round biscuits to the nearest integer
        int biscuitsRounded = (int) Math.round(biscuit);

        System.out.printf("Total eaten biscuits: %dgr.%n", biscuitsRounded);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodEaten / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalFoodEatenDog / totalFoodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalFoodEatenCat / totalFoodEaten * 100);

    }
}
