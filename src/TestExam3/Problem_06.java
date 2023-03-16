package TestExam3;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        boolean flag = false;
        int winCounter = 0;
        int loseCounter = 0;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            int dailyWinCounter = 0;
            int dailyLoseCounter = 0;
            double currentSum = 0;
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")){
                    currentSum += 20;
                    dailyWinCounter ++;
                }else if (result.equals("lose")){
                    dailyLoseCounter++;
                }

                input = scanner.nextLine();
            }

            if (dailyWinCounter > dailyLoseCounter){
                currentSum = currentSum + currentSum * 0.10;
            }
            winCounter += dailyWinCounter;
            loseCounter += dailyLoseCounter;
            totalPrice += currentSum;

        }

        if (winCounter > loseCounter){
            totalPrice = totalPrice + totalPrice * 0.20;
            flag = true;
        }

        if (flag){
            System.out.printf("You won the tournament! Total raised money: %.2f", totalPrice);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalPrice);
        }
    }
}
