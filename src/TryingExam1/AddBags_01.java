package TryingExam1;

import java.util.Scanner;

public class AddBags_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Цената на багаж над 20кг - реално число в диапазона [10.0…80.0]
        //2.	Килограми на багажа – реално число в диапазона [1.0…32.0]
        //3.	Дни до пътуването – цяло число в диапазона [1…60]
        //4.	Брой багажи – цяло число в диапазона [1…10]

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (luggageKg < 10){
            price = priceOver20kg * 0.20;
        }else if (luggageKg <= 20){
            price = priceOver20kg * 0.50;
        }else {
            price = priceOver20kg;
        }

        if (daysUntilTrip < 7){
            price = price + (price * 0.40);
        }else if (daysUntilTrip <= 30){
            price = price + (price * 0.15);
        }else {
            price = price + (price * 0.10);
        }
        double totalPrice = price * countLuggage;
        System.out.printf("The total price of bags is: %.2f lv. ", totalPrice);
    }
}
