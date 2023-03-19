package AdditionalExamTasks_01;

import java.util.Scanner;

public class PoolDay_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double priceSunLounger = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double entryTaxTotal = people * entryTax;
        double umbrellasNeeded = Math.ceil(people / 2.0);
        double priceUmbrellasTotal = umbrellasNeeded * priceUmbrella;
        double sunLoungerNeeded = Math.ceil(people * 0.75);
        double priceSunLoungerTotal = sunLoungerNeeded * priceSunLounger;

        double totalSum = entryTaxTotal + priceSunLoungerTotal + priceUmbrellasTotal;
        System.out.printf("%.2f lv.", totalSum);


    }
}
