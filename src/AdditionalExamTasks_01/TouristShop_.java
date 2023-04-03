package AdditionalExamTasks_01;

import java.util.Scanner;

public class TouristShop_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        double totalPrice = 0;
        int counter = 0;


        while (!product.equals("Stop")) {
           double priceProduct = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                priceProduct = priceProduct / 2;
            }
            totalPrice += priceProduct;
            if (totalPrice > budget) {
                double neededMoney = totalPrice - budget;
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", neededMoney);
                break;
            }


            product = scanner.nextLine();
        }

        if (product.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
        }
    }
}
