package ForLoop.Exc;

import java.util.Scanner;

public class Tennis_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0.0;
        double averagePoints = 0.0;
        double pointsFromTour = 0;
        int wonTournaments = 0;
        for (int i = 1; i <= countTournaments ; i++) {
            String reachedStage = scanner.nextLine();
            switch (reachedStage){
                case "W":
                    totalPoints = startPoints += 2000;
                    pointsFromTour = pointsFromTour +2000;
                    wonTournaments++;
                    break;
                case "F":
                    totalPoints = startPoints += 1200;
                    pointsFromTour = pointsFromTour +1200;
                    break;
                case "SF":
                    totalPoints = startPoints += 720;
                    pointsFromTour = pointsFromTour +720;
                    break;
            }

        }
        double winPercent = wonTournaments * 1.0 / countTournaments * 100;
        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(pointsFromTour / countTournaments));
        System.out.printf("%.2f%%", winPercent);
    }
}
