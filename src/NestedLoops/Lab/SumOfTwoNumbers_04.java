package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        int x1 = 0;
        int x2 = 0;

        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                counter++;
            if (i + j == magicNum){
                flag = true;
                x1 = i;
                x2 = j;
                break;
            }

            }
            if (flag){
                break;
            }

        }
        if (flag){
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, x1, x2, magicNum);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }

}

