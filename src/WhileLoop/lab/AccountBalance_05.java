package WhileLoop.lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double balance = 0;
        while (!input.equals("NoMoreMoney")){
            double number = Double.parseDouble(input);
            if (number < 0){
                System.out.println("Invalid operation!");
                break;
            }

            balance += number;
            System.out.printf("Increase: %.2f%n", number);
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f", balance);
    }
}
