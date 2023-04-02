package AdditionalExamTasks_01;

import java.util.Scanner;

public class TouristShop_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        double totalPrice = 0;
        int counter = 0;
        double sumLeft = budget;
        boolean flag = false;
        double priceProduct = 0;

        while (!product.equals("Stop")){
             priceProduct = Double.parseDouble(scanner.nextLine());

            if (priceProduct > sumLeft){
                flag = true;
                break;
            }
            counter++;
            if (counter % 3 == 0){
                priceProduct = priceProduct / 2;
            }

            sumLeft -= priceProduct;
            totalPrice += priceProduct;



            product = scanner.nextLine();
        }

        if (flag){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(sumLeft - priceProduct));
        }else {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
        }
    }
}
