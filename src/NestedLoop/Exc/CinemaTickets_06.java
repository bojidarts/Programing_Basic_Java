package NestedLoop.Exc;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int countStandardTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;
        int counter = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            int currentCounter = 0;
            while (!input.equals("End")) {
                counter++;
                currentCounter++;
                switch (input) {
                    case "student":
                        countStudentTickets++;
                        break;
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }
            if (currentCounter == freeSeats){
                break;
            }

                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, currentCounter * 1.00 / freeSeats * 100);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", counter);
        System.out.printf("%.2f%% student tickets.%n", countStudentTickets * 1.00 / counter * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandardTickets * 1.00 / counter * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKidTickets * 1.00 / counter * 100);

    }
}
