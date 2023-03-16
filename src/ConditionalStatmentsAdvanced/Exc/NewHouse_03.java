package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double priceFlowers = 0.00;

        switch (flowers) {
            case "Roses":
                priceFlowers = countFlowers * 5.00;
                if (countFlowers > 80){
                    priceFlowers = priceFlowers - priceFlowers * 0.10;
                }
                break;
            case "Dahlias":
                priceFlowers = countFlowers * 3.80;
                if (countFlowers > 90){
                    priceFlowers = priceFlowers - priceFlowers * 0.15;
                }
                break;
            case "Tulips":
                priceFlowers = countFlowers * 2.80;
                if (countFlowers > 80){
                    priceFlowers = priceFlowers - priceFlowers * 0.15;
                }
                break;
            case "Narcissus":
                priceFlowers = countFlowers * 3.00;
                if (countFlowers < 120){
                    priceFlowers = priceFlowers + priceFlowers * 0.15;
                }
                break;
            case "Gladiolus":
                priceFlowers = countFlowers * 2.50;
                if (countFlowers < 80){
                    priceFlowers = priceFlowers + priceFlowers * 0.20;
                }
                break;
        }
        if (budget >= priceFlowers){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, budget - priceFlowers);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", priceFlowers - budget);
        }

    }
}
