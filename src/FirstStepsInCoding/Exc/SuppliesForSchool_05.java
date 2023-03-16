package FirstStepsInCoding.Exc;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleaner = cleaner * 1.20;
        double priceAll = pricePens + priceMarkers + priceCleaner;
        double finalPrice = priceAll - (priceAll * percentDiscount / 100);
        System.out.println(finalPrice);
        }



    }

