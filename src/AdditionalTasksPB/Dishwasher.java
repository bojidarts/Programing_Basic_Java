package AdditionalTasksPB;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int amountDetergent = bottles * 750;
        String dishes = scanner.nextLine();
        int countPlates = 0;
        int countPots = 0;
        int countDish = 0;
        int totalMl = 0;
        int mlDishes = 0;
        boolean flag = false;
        while (!dishes.equals("End")) {
            int kindDishes = Integer.parseInt(dishes);

            countDish++;
            mlDishes = 5 * kindDishes;
            if (countDish % 3 == 0){
                mlDishes = kindDishes * 15;
                countPots += kindDishes;
            }else {
                countPlates += kindDishes;
            }

            if (mlDishes > amountDetergent){
                flag = true;
                break;
            }
            amountDetergent -= mlDishes;
            totalMl += mlDishes;

            dishes = scanner.nextLine();
        }
        if (flag){
            System.out.printf("Not enough detergent, %d ml. more necessary!", mlDishes - amountDetergent);
        }else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countPlates, countPots);
            System.out.printf("Leftover detergent %d ml.", amountDetergent);
        }
    }
}
