package Exam;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kilometersFirstDay = Double.parseDouble(scanner.nextLine());

        double totalDistancePerDay = kilometersFirstDay;
        double total = kilometersFirstDay;

        for (int i = 1; i <= days; i++) {
            double percent = Double.parseDouble(scanner.nextLine());
            double percentDistance = percent / 100.0;
            double additionalDistance = totalDistancePerDay * percentDistance;
            totalDistancePerDay += additionalDistance;
            total += totalDistancePerDay;
        }
        if (total >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(total - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - total));
        }
    }
}