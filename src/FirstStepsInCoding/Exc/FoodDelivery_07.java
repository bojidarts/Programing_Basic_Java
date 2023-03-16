package FirstStepsInCoding.Exc;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double priceChicken = chicken * 10.35;
        double priceFish = fish * 12.40;
        double priceVegan = vegan * 8.15;

        double priceAllMenus = priceChicken + priceFish + priceVegan;
        double priceDesert = priceAllMenus * 0.20;
        double totalPrice = priceAllMenus + priceDesert + 2.50;
        System.out.println(totalPrice);

    }
}
