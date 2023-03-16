package FirstStepsInCoding.Exc;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNylon = (nylon + 2) * 1.50;
        double pricePaint = (paint + paint * 0.10) * 14.50;
        double priceThinner = thinner * 5.00;

        double priceMaterials = priceNylon + pricePaint + priceThinner + 0.40;
        double priceWorkers = (priceMaterials * 0.30) * hours;
        double totalPrice = priceMaterials + priceWorkers;
        System.out.println(totalPrice);



    }
}
