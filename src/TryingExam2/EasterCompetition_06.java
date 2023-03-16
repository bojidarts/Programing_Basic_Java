package TryingExam2;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 0; i < easterBreads; i++) {
            String baker = scanner.nextLine();
            int points = 0;

            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int score = Integer.parseInt(command);
                points += score;
                command = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", baker, points);

            if (points > maxPoints) {
                maxPoints = points;
                winner = baker;
                System.out.printf("%s is the new number 1!%n", winner);
            }
        }

        System.out.printf("%s won competition with %d points!", winner, maxPoints);

    }
}
