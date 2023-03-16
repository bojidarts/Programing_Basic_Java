package TryingExam_2_2;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Цена на брашното за един килограм – реално число в интервала [0.00 … 10000.00]
        //2.	Килограми на брашното – реално число в интервала [0.00 … 10000.00]
        //3.	Килограми на захарта – реално число в интервала [0.00 … 10000.00]
        //4.	Брой кори с яйца – цяло число в интервала [0 … 10000]
        //5.	Пакети мая  – цяло число в интервала [0 … 10000]
        double priceFlowerKg = Double.parseDouble(scanner.nextLine());
        double flowerKG = Double.parseDouble(scanner.nextLine());
        double sugarKG = Double.parseDouble(scanner.nextLine());
        int eggsBoxes = Integer.parseInt(scanner.nextLine());
        int yeastPackages = Integer.parseInt(scanner.nextLine());

        double priceSugarKg =  priceFlowerKg - priceFlowerKg * 0.25;
        double priceEggsBox = priceFlowerKg + priceFlowerKg * 0.10;
        double priceYeastPackage = priceSugarKg - priceSugarKg * 0.80;
        double priceFlowerTotal = priceFlowerKg * flowerKG;
        double priceSugarTotal = sugarKG * priceSugarKg;
        double priceEggsTotal = eggsBoxes * priceEggsBox;
        double priceYeastTotal = yeastPackages * priceYeastPackage;

        double totalSum = priceEggsTotal + priceFlowerTotal + priceSugarTotal + priceYeastTotal;
        System.out.printf("%.2f", totalSum);

    }
}
