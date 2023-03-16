package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double expenses = 0.00;
        String typeRest = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                expenses = budget * 0.30;
                typeRest = "Camp";
            } else if (season.equals("winter")) {
                expenses = budget * 0.70;
                typeRest = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                expenses = budget * 0.40;
                typeRest = "Camp";
            } else if (season.equals("winter")) {
                expenses = budget * 0.80;
                typeRest = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            expenses = budget * 0.90;
            typeRest = "Hotel";
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, typeRest, expenses);


    }
}
