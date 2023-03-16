package TryingExam1;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //       1.	Име на авиокомпанията - текст
        //2.	Брой билети за	 възрастни – цяло число в диапазона [1…400]
        //3.	Брой детски билети – цяло число в диапазона [25…120]
        //4.	Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        //5.	Цената на такса обслужване - реално число в диапазона [10.0…50.0]
        String name = scanner.nextLine();
        int countAdultTickets = Integer.parseInt(scanner.nextLine());
        int countKidsTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceKidsTicket = priceAdultTicket - priceAdultTicket * 0.70;

        double priceAdultPlusTax = priceAdultTicket + tax;
        double priceKidsPlusTax = priceKidsTicket + tax;
        double totalPrice = (countAdultTickets * priceAdultPlusTax) + (countKidsTickets * priceKidsPlusTax);
        double profit = totalPrice * 0.20;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);


    }
}
