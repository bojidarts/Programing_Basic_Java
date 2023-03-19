package AdditionalExamTasks_01;

import java.util.Scanner;

public class FamilyTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentOtherExpenses = Integer.parseInt(scanner.nextLine());
        if (nights > 7){
            pricePerNight = pricePerNight - pricePerNight * 0.05;
        }

        double priceNightsTotal = nights * pricePerNight;
        double otherExpensesPrice = budget * (percentOtherExpenses / 100.0);
        double totalSum = priceNightsTotal + otherExpensesPrice;
        if (budget >= totalSum){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        }else {
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
        System.out.println();
    }
}
