package AdditionalTasksPB;

import java.util.Scanner;

public class UnicPINCodes_02 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int up1 = Integer.parseInt(scanner.nextLine());
        int up2 = Integer.parseInt(scanner.nextLine());
        int up3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= up1; i += 2) {

            for (int j = 2; j <= up2; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= up3; k += 2) {
                        String pin = i + " " + j + " " + k;
                        System.out.println(pin);
                    }

                }
            }

        }
    }
}