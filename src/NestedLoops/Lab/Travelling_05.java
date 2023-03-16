package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double savedMoney = Double.parseDouble(scanner.nextLine());
            double myMoney = 0;
            while (myMoney < savedMoney) {
                double savingMoney = Double.parseDouble(scanner.nextLine());
                myMoney += savingMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();

        }


    }
}
