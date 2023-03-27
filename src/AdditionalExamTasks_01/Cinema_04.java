package AdditionalExamTasks_01;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalPrice = 0;
        int counter = 0;
        boolean flag = false;

        while (!input.equals("Movie time!")){
            int currentPeople = Integer.parseInt(input);
            int currentPrice = currentPeople * 5;
            if (currentPeople % 3 == 0){
                currentPrice = currentPrice - 5;
            }
            counter += currentPeople;
            if (counter > hallCapacity){
                flag = true;
                break;
            }


            totalPrice += currentPrice;
            input = scanner.nextLine();
        }
        if (flag){
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.", totalPrice);
        }else {
            System.out.printf("There are %d seats left in the cinema.%n", hallCapacity - counter);
            System.out.printf("Cinema income - %d lv.", totalPrice);
        }
    }
}
