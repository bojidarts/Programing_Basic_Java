package ForLoop.Exc;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sumNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (maxNumber < number) {
                maxNumber = number;

            }
            sumNumbers += number;

        }
        int sumWithoutMaxNum = sumNumbers - maxNumber;
        if (sumWithoutMaxNum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumWithoutMaxNum - maxNumber));
        }
    }
}
