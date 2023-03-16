package TryingExam_2_2;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countClient = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;


        for (int i = 1; i <= countClient; i++) {
            double pricePerClient = 0;
            int counter = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                switch (input) {
                    case "basket":
                        pricePerClient += 1.50;
                        counter++;
                        break;
                    case "wreath":
                        pricePerClient += 3.80;
                        counter++;
                        break;
                    case "chocolate bunny":
                        pricePerClient += 7;
                        counter++;
                        break;
                }


                input = scanner.nextLine();
            }
            if (counter % 2 == 0){
                pricePerClient = pricePerClient - pricePerClient * 0.20;
            }
            totalPrice += pricePerClient;
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, pricePerClient);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalPrice / countClient);
    }
}
