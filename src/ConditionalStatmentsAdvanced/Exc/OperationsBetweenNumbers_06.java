package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.00;
        String evenOrOdd = "";

        switch (operator){
            case "+":
                result = num1 + num2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0){
                    evenOrOdd = "even";
                }else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case "/":
                result = num1 * 1.00 / num2;
                if (num2 == 0){
                    System.out.printf("Cannot divide %d by zero", num1);
                }else {
                    System.out.printf("%d %s %d = %.2f", num1, operator, num2, result);
                }
                break;
            case "%":
                result = num1 * 1.00 % num2;
                if (num2 == 0){
                    System.out.printf("Cannot divide %d by zero", num1);
                }else {
                    System.out.printf("%d %s %d = %.0f", num1, operator, num2, result);
                }
                break;

        }

    }
}
