package TryingExam_2_2;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double numEasterBreads = Math.ceil(numGuests / 3.0);
        int numEggs = numGuests * 2;

        double priceEasterBreads = numEasterBreads * 4;
        double priceEggs = numEggs * 0.45;
        double totalPrice = priceEggs + priceEasterBreads;
        if (budget >= totalPrice){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", numEasterBreads, numEggs);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }

    }
}
