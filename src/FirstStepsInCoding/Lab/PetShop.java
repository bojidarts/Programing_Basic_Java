package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int packagesDogFood = Integer.parseInt(scanner.nextLine());
            int packagesCatFood = Integer.parseInt(scanner.nextLine());
            double priceDogFood = packagesDogFood * 2.50;
            double priceCatFood = packagesCatFood * 4;
            double totalPrice = priceDogFood + priceCatFood;
            System.out.println(totalPrice);

        }
    }

