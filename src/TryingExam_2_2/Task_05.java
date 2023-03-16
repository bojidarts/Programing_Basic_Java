package TryingExam_2_2;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        double sugarTotal = 0;
        double flowerTotal = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlower = Integer.MIN_VALUE;

        for (int i = 1; i <= easterBread; i++) {
            int sugarQuantity = Integer.parseInt(scanner.nextLine());
            int flowerQuantity = Integer.parseInt(scanner.nextLine());
            sugarTotal += sugarQuantity;
            flowerTotal += flowerQuantity;
            if (maxSugar < sugarQuantity) {
                maxSugar = sugarQuantity;
            }
            if (maxFlower < flowerQuantity) {
                maxFlower = flowerQuantity;
            }

        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(sugarTotal / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(flowerTotal / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlower, maxSugar);

    }
}
