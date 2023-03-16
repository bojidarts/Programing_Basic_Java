package TestExam3;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int countWalksPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalking = minutesPerDay * countWalksPerDay;
        int totalCaloriesFromWalks = totalMinutesWalking * 5;
        int halfCalories = caloriesPerDay / 2;
        if (totalCaloriesFromWalks >= halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCaloriesFromWalks);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalCaloriesFromWalks);
        }

    }
}
