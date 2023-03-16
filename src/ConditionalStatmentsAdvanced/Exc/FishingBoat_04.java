package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// •	Бюджет на групата – цяло число в интервала [1…8000]
//•	Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
//•	Брой рибари – цяло число в интервала [4…18]
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        switch (season) {
            case "Spring":
                price = 3000;
                if (fishermen <= 6) {
                    price = price - price * 0.10;
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = price - price * 0.15;
                } else if (fishermen > 12) {
                    price = price - price * 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                if (fishermen <= 6) {
                    price = price - price * 0.10;
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = price - price * 0.15;
                } else if (fishermen > 12) {
                    price = price - price * 0.25;
                }
                break;
            case "Winter":
                price = 2600;
                if (fishermen <= 6) {
                    price = price - price * 0.10;
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = price - price * 0.15;
                } else if (fishermen > 12) {
                    price = price - price * 0.25;
                }
                break;
        }
        if (!season.equals("Autumn") && fishermen % 2 ==0) {
            price = price - price * 0.05;
        }
        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
