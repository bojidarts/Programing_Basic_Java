package FirstStepsInCoding.Exc;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - tax * 0.40;
        double equipment = shoes - shoes * 0.20;
        double ball = equipment / 4;
        double accessories = ball / 5;

        double totalPrice = tax + shoes + equipment + ball + accessories;
        System.out.println(totalPrice);

    }
}
