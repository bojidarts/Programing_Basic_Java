package TestExam3;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        int foodInGrams = foodInKg * 1000;
        String input = scanner.nextLine();
        int totalGramsEaten = 0;
        while (!input.equals("Adopted")){
            int eatenGrams = Integer.parseInt(input);
            totalGramsEaten +=eatenGrams;

            input = scanner.nextLine();
        }
        if (foodInGrams >=totalGramsEaten){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - totalGramsEaten);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", totalGramsEaten - foodInGrams);
        }
    }
}
