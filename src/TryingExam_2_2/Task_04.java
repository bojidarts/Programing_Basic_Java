package TryingExam_2_2;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsQuantity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counterSoldEggs = 0;
        while (!input.equals("Close")){
            int countEggs = Integer.parseInt(scanner.nextLine());
            if (input.equals("Buy")){
                if (countEggs > eggsQuantity) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.\n", eggsQuantity);
                    break;
                }
                eggsQuantity = eggsQuantity - countEggs;
                counterSoldEggs += countEggs;
            }else if (input.equals("Fill")){
                eggsQuantity = eggsQuantity + countEggs;
            }
            input = scanner.nextLine();
        }

        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.\n", counterSoldEggs);
        }
    }
}
