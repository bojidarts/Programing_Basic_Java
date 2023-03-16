package ForLoop.Exc;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());

        double totalPeople = 0;

        int musala = 0;
        int monblan = 0;
        int kilimandzharo = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= countGroups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandzharo += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }

        }
        System.out.printf("%.2f%%%n", musala / totalPeople * 100);
        System.out.printf("%.2f%%%n", monblan / totalPeople * 100);
        System.out.printf("%.2f%%%n", kilimandzharo / totalPeople * 100);
        System.out.printf("%.2f%%%n", k2 / totalPeople * 100);
        System.out.printf("%.2f%%%n", everest / totalPeople * 100);
    }
}
