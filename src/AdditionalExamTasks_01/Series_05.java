package AdditionalExamTasks_01;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSeries = Integer.parseInt(scanner.nextLine());
        double totalExpenses = 0;
        for (int i = 0; i < countSeries; i++) {
            String nameSerial = scanner.nextLine();
            double priceSerial = Double.parseDouble(scanner.nextLine());
            switch (nameSerial) {
                case "Thrones":
                    priceSerial = priceSerial - priceSerial * 0.50;
                    break;
                case "Lucifer":
                    priceSerial = priceSerial - priceSerial * 0.40;
                    break;
                case "Protector":
                    priceSerial = priceSerial - priceSerial * 0.30;
                    break;
                case "TotalDrama":
                    priceSerial = priceSerial - priceSerial * 0.20;
                    break;
                case "Area":
                    priceSerial = priceSerial - priceSerial * 0.10;
                    break;
            }
            totalExpenses += priceSerial;

        }
        if (budget >= totalExpenses) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalExpenses);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalExpenses - budget);
        }

    }
}
