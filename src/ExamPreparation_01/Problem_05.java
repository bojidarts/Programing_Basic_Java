package ExamPreparation_01;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int bestGoals = 0;
        boolean hatTrick = false;

        while (true) {

            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestGoals) {
                bestGoals = goals;
                bestPlayer = playerName;
                if (goals >= 3) {
                    hatTrick = true;
                }
            }
            if (goals >= 10) {
                break;
            }
        }

        System.out.println(bestPlayer + " is the best player!");
        if (hatTrick) {
            System.out.println("He has scored " + bestGoals + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + bestGoals + " goals.");
        }

    }
}
