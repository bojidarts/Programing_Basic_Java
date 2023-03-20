package AdditionalExamTasks_01;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	Първи ред - напитка - текст с възможности"Espresso", "Cappuccino" или "Tea"
        //•	Втори ред - захар - текст  с възможности "Without", "Normal" или "Extra"
        //•	Трети ред - брой напитки - цяло число в интервала [1… 50]
        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0;


        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = countDrinks * 0.90;
                    price = price - price * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = countDrinks * 1.00;
                } else if (sugar.equals("Extra")) {
                    price = countDrinks * 1.20;
                }
                if ( countDrinks >= 5) {
                    price = price - price * 0.25;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = countDrinks * 1.00;
                    price = price - price * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = countDrinks * 1.20;
                } else if (sugar.equals("Extra")) {
                    price = countDrinks * 1.60;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = countDrinks * 0.50;
                    price = price - price * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = countDrinks * 0.60;
                } else if (sugar.equals("Extra")) {
                    price = countDrinks * 0.70;
                }
                break;


        }

        if (price > 15){
            price = price - price * 0.20;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drink, price);
    }
}
