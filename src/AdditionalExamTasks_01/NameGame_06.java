package AdditionalExamTasks_01;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String winner = "";
        int highestScore = Integer.MIN_VALUE;

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("Stop")) {
                break;
            }
            int score = 0;
            String letters = scanner.nextLine();
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number == letter || number == letter + 32 || number == letter - 32) {
                    score += 10;
                } else {
                    score += 2;
                }
            }
            if (score > highestScore) {
                highestScore = score;
                winner = name;
            } else if (score == highestScore) {
                if (name.compareTo(winner) > 0) {
                    winner = name;
                }
            }

        }
        System.out.println("The winner is " + winner + " with " + highestScore + " points!");
    }
}
