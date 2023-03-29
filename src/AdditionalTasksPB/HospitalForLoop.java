package AdditionalTasksPB;

import java.util.Scanner;

public class HospitalForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int doctors = 7;
        int days = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            int diff = patients - doctors;

            if (diff <= 0) {
                treatedPatients += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += diff;
            }

            if (i % 3 == 2 && untreatedPatients > treatedPatients) {
                doctors++;
            }

        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
