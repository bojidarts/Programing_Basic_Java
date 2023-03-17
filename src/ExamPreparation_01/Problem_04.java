package ExamPreparation_01;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double pointsCounter = 0;
        int otherColorsCounter = 0;
        int blackDevideCounter = 0;
        int redBallsCounter = 0;
        int orangeBallsCounter = 0;
        int yellowBallsCounter = 0;
        int whiteBallsCounter = 0;

        for (int i = 1; i <= n; i++) {
            String colors = scanner.nextLine();
            switch (colors) {
                case "red":
                    pointsCounter+=5;
                    redBallsCounter++;
                    break;
                case "orange":
                    pointsCounter += 10;
                    orangeBallsCounter++;
                    break;
                case "yellow":
                    pointsCounter += 15;
                    yellowBallsCounter++;
                    break;
                case "white":
                    pointsCounter += 20;
                    whiteBallsCounter++;
                    break;
                case "black":
                    pointsCounter = Math.floor(pointsCounter / 2);
                    blackDevideCounter++;
                    break;
                default:
                otherColorsCounter++;
                    break;
            }

        }
        System.out.printf("Total points: %.0f%n", pointsCounter);
        System.out.printf("Red balls: %d%n", redBallsCounter);
        System.out.printf("Orange balls: %d%n", orangeBallsCounter);
        System.out.printf("Yellow balls: %d%n", yellowBallsCounter);
        System.out.printf("White balls: %d%n", whiteBallsCounter);
        System.out.printf("Other colors picked: %d%n", otherColorsCounter);
        System.out.printf("Divides from black balls: %d%n", blackDevideCounter);

    }
}
