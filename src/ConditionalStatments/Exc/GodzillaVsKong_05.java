package ConditionalStatments.Exc;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceClothesExtra = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.10;
        double priceClothesTotal = countExtras * priceClothesExtra;
        if (countExtras > 150) {
            priceClothesTotal = priceClothesTotal - (priceClothesTotal * 0.10);
        }
        double totalExpenses = priceClothesTotal + priceDecor;
        if (budget >= totalExpenses){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - totalExpenses);
        }else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", totalExpenses - budget);
        }

    }
}
