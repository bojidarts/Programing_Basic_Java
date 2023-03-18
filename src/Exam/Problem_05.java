package Exam;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaTours = scanner.nextInt();
        int mountainTours = scanner.nextInt();

        // Calculate initial prices
        int seaPrice = 680;
        int mountainPrice = 499;

        // Initialize profit and sold packages counters
        int profit = 0;
        int soldSea = 0;
        int soldMountain = 0;

        // Read package names until "Stop" or all packages are sold
        String packageName = scanner.next();
        while (!packageName.equals("Stop")) {
            // Check if package is available and add to total price and profit
            if (packageName.equals("sea") && soldSea < seaTours) {
                profit += seaPrice;
                soldSea++;
            } else if (packageName.equals("mountain") && soldMountain < mountainTours) {
                profit += mountainPrice;
                soldMountain++;
            }

            // Read next package name or break loop if all packages are sold
            if (soldSea == seaTours && soldMountain == mountainTours) {
                System.out.println("Good job! Everything is sold.");
                break;
            } else {
                packageName = scanner.next();
            }
        }

        // Print final profit
        System.out.println("Profit: " + profit + " leva.");
    }
}
