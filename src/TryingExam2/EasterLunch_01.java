package TryingExam2;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	Брой козунаци - цяло число в интервала [0 … 99]
        //•	Брой кори с яйца - цяло число в интервала [0 … 99]
        //•	Килограми курабии - цяло число в интервала [0 … 99]

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookiesKg = Integer.parseInt(scanner.nextLine());

        double priceEasterBreads = easterBreads * 3.20;
        double priceEggs = eggs * 4.35;
        double priceCookies = cookiesKg * 5.40;
        double pricePaint = eggs * 12 * 0.15;

        double totalPrice = priceEasterBreads + priceEggs + priceCookies + pricePaint;
        System.out.printf("%.2f", totalPrice);

    }
}
