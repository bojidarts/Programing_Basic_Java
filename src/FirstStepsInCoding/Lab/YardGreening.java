package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double totalPrice = meters * 7.61;
        double discount = 0.18 * totalPrice;
        double finalPrice = totalPrice - discount;
        // The final price is: 3432.11 lv.
        //The discount is: 753.39 lv.
        System.out.printf("The final price is: %f lv.%nThe discount is: %f lv.", finalPrice, discount);

    }
}
