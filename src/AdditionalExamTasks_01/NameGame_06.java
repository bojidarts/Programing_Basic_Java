package AdditionalExamTasks_01;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        int bestScores = 0;
        String bestPlayer = "";

        while (!playerName.equals("Stop")) {
            int nameLength = playerName.length();
            int scores = 0;

            for (int i = 0; i < nameLength; i++) {
                char letter = playerName.charAt(i);
                int number = Integer.parseInt(scanner.nextLine());

                if (letter == number) {
                    scores += 10;
                } else {
                    scores += 2;
                }
            }

            if (scores >= bestScores) {
                bestScores = scores;
                bestPlayer = playerName;
            }

            playerName = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", bestPlayer, bestScores);
    }
}
