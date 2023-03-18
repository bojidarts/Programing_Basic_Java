package Exam;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// 1.	Цена на моминското парти - реално число в интервала [1.00 … 10000.00]
//2.	Брой любовни послания - цяло число в интервала [0… 1000]
//3.	Брой восъчни рози - цяло число в интервала [0 … 1000]
//4.	Брой ключодържатели - цяло число в интервала [0 … 1000]
//5.	Брой карикатури - цяло число в интервала [0 … 1000]
//6.	Брой късмети изненада - цяло число в интервала [0 … 1000]

        double priceParty = Double.parseDouble(scanner.nextLine());
        int countLoveLetters = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countKeyHolders = Integer.parseInt(scanner.nextLine());
        int countSculptures = Integer.parseInt(scanner.nextLine());
        int countLuck = Integer.parseInt(scanner.nextLine());

        double priceLoveLetters = countLoveLetters * 0.60;
        double priceRoses = countRoses * 7.20;
        double priceKeyHolders = countKeyHolders * 3.60;
        double priceSculptures = countSculptures * 18.20;
        double priceLuck = countLuck * 22;
        double totalSum = priceLuck + priceSculptures + priceKeyHolders+ priceRoses + priceLoveLetters;
        int countALlArticuls = countLoveLetters + countRoses + countKeyHolders + countSculptures + countLuck;

        if (countALlArticuls >= 25){
            totalSum = totalSum - totalSum * 0.35;
        }
        totalSum = totalSum - totalSum * 0.10;

        if (totalSum >= priceParty){
            System.out.printf("Yes! %.2f lv left.", totalSum - priceParty);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",priceParty - totalSum );
        }

    }
}
