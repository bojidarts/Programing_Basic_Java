package Exam;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int count = 0; // брояч на валидните смени

        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        if (i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0) {
                            String firstPlayer = "" + i + j;
                            String secondPlayer = "" + k + l;
                            if (!firstPlayer.equals(secondPlayer)) {
                                if (count < 6) {
                                    System.out.printf("%s - %s%n", firstPlayer, secondPlayer);
                                    count++;
                                } else {
                                    return;
                                }
                            } else {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }
            }
        }

    }
}
