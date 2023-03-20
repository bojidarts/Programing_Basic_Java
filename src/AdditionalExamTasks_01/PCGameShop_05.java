package AdditionalExamTasks_01;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double countHearthstone = 0;
        double countFornite = 0;
        double countOverwatch = 0;
        double countOthers = 0;
        double countTotal = 0;

        for (int i = 0; i < n; i++) {
            String game = scanner.nextLine();
            switch (game) {
                case "Hearthstone":
                    countHearthstone++;
                    countTotal++;
                    break;
                case "Fornite":
                    countFornite++;
                    countTotal++;
                    break;
                case "Overwatch":
                    countOverwatch++;
                    countTotal++;
                    break;
                default:
                    countOthers++;
                    countTotal++;
                    break;
            }

        }
        System.out.printf("Hearthstone - %.2f%%%n", (countHearthstone / countTotal) * 100);
        System.out.printf("Fornite - %.2f%%%n", (countFornite / countTotal) * 100);
        System.out.printf("Overwatch - %.2f%%%n", (countOverwatch / countTotal) * 100);
        System.out.printf("Others - %.2f%%%n", (countOthers / countTotal) * 100);
    }
}
