package AdditionalTasksPB;

import java.util.Scanner;

public class UniquePINCodes {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstUpperLimit = scanner.nextInt();
        int secondUpperLimit = scanner.nextInt();
        int thirdUpperLimit = scanner.nextInt();


        for (int i = 2; i <= firstUpperLimit; i += 2) {
            for (int j = 2; j <= secondUpperLimit; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= thirdUpperLimit; k += 2) {
                        String pin = i + " " + j + " " + k;
                        System.out.println(pin);
                    }

                }
            }


        }
    }
}