package ConditionalStatments.Exc;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double priceToys = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        int countToys = puzzles + dolls + bears + minions + trucks;
        if (countToys >= 50) {
            priceToys = priceToys - (priceToys * 0.25);
        }
        double finalPrice = priceToys - (priceToys * 0.10);
        if (finalPrice >= priceVacation){
            double moneyLeft = finalPrice - priceVacation;
            System.out.printf("Yes! %.2f lv left.",moneyLeft );
        }else {
            double moneyNeeded = priceVacation - finalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }

    }
}
