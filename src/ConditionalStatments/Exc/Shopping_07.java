package ConditionalStatments.Exc;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceOneProcessor = priceVideoCards * 0.35;
        double priceProcessors = processors * priceOneProcessor;
        double priceOneRamMemory = priceVideoCards * 0.10;
        double priceRamMemory = ramMemory * priceOneRamMemory;

        double priceAll = priceVideoCards + priceProcessors + priceRamMemory;
        if (videoCards > processors){
            priceAll = priceAll - (priceAll * 0.15);
        }
        if (budget >= priceAll){
            System.out.printf("You have %.2f leva left!", budget - priceAll);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", priceAll - budget);
        }

    }
}
