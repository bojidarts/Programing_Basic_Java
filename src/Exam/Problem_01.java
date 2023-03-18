package Exam;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	Процент на мазнините - цяло число в интервала [0…100]
        //•	Процент на протеините - цяло число в интервала [0…100]
        //•	Процент на въглехидратите - цяло число в интервала [0…100]
        //•	Общ брой калории - цяло число в интервала [1000…15000]
        //•	Процент на съдържанието на вода - цяло число в интервала [0…100]

        int percentFats = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int countCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double percentFatsAll = (percentFats * 1.0) / 100;
        double percentProteinsAll = (percentProteins * 1.0) / 100;
        double percentCarbohydratesAll = (percentCarbohydrates * 1.0) / 100;
        double percentWaterAll = (percentWater * 1.0) / 100;

        double totalGramsFats = (percentFatsAll * countCalories) / 9;
        double totalGramsProtein = (percentProteinsAll * countCalories) / 4;
        double totalGramsCarbohydrates = (percentCarbohydratesAll * countCalories) / 4;

        double weightFood = totalGramsFats + totalGramsProtein + totalGramsCarbohydrates;
        double caloriesForOneGramFood = countCalories / weightFood;
        double caloriesToPrint = caloriesForOneGramFood * (1 - percentWaterAll);
        System.out.printf("%.4f", caloriesToPrint);

    }
}
