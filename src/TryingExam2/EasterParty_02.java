package TryingExam2;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Брой гости – цяло число в интервала [1...99]
        //2.	Цена на куверт за един човек – реално число в интервала [0.00 … 99.00]
        //3.	Бюджетът на Деси  – реално число в интервала [0.00 … 9999.00]
        int numGuests = Integer.parseInt(scanner.nextLine());
        double pricePlatePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (numGuests >= 10 && numGuests <= 15){
            pricePlatePerPerson = pricePlatePerPerson - pricePlatePerPerson * 0.15;
        }else if (numGuests > 15 && numGuests <= 20){
            pricePlatePerPerson = pricePlatePerPerson - pricePlatePerPerson * 0.20;
        }else if (numGuests > 20){
            pricePlatePerPerson = pricePlatePerPerson - pricePlatePerPerson * 0.25;
        }
        double expenses = numGuests * pricePlatePerPerson;
        double priceCake = budget * 0.10;
        double totalExpenses = expenses + priceCake;

        if (budget >= totalExpenses){
            System.out.printf("It is party time! %.2f leva left.", budget - totalExpenses);
        }else {
            System.out.printf("No party! %.2f leva needed.", totalExpenses - budget);
        }
    }
}
