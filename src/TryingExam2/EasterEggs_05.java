package TryingExam2;

import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());
        int redEggsCounter = 0;
        int orangeEggsCounter = 0;
        int blueEggsCounter = 0;
        int greenEggsCounter = 0;
        String colorEgg = "";
        String mostEggsColor = "";
        int mostEggs = Integer.MIN_VALUE;

        for (int i = 1; i <= paintedEggs; i++) {
           colorEgg = scanner.nextLine();
        if (colorEgg.equals("red")){
            redEggsCounter++;
            if (redEggsCounter > mostEggs){
                mostEggs = redEggsCounter;
                mostEggsColor = "red";
            }
        }else if (colorEgg.equals("orange")){
            orangeEggsCounter++;
            if (orangeEggsCounter > mostEggs){
                mostEggs = orangeEggsCounter;
                mostEggsColor = "orange";
            }
        }else if (colorEgg.equals("blue")){
            blueEggsCounter++;
            if (blueEggsCounter > mostEggs){
                mostEggs = blueEggsCounter;
                mostEggsColor = "blue";
            }
        }else if (colorEgg.equals("green")){
            greenEggsCounter++;
            if (greenEggsCounter > mostEggs){
                mostEggs = greenEggsCounter;
                mostEggsColor = "green";
            }
        }

        }
        System.out.printf("Red eggs: %d%n", redEggsCounter);
        System.out.printf("Orange eggs: %d%n", orangeEggsCounter);
        System.out.printf("Blue eggs: %d%n", blueEggsCounter);
        System.out.printf("Green eggs: %d%n", greenEggsCounter);
        System.out.printf("Max eggs: %d -> %s", mostEggs, mostEggsColor);

    }
}
