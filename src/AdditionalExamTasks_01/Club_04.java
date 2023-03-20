package AdditionalExamTasks_01;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double requiredIncome = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double priceCoctail = 0;
        boolean isEnaugh = false;
        double priceTotal = 0;

        while (!input.equals("Party!")){
            int numCoctails = Integer.parseInt(scanner.nextLine());
            priceCoctail = input.length() * numCoctails;

            if (priceCoctail % 2 != 0){
                priceCoctail = priceCoctail - priceCoctail * 0.25;
            }
            priceTotal += priceCoctail;
            if (priceTotal >= requiredIncome){
                isEnaugh = true;
                break;
            }


            input = scanner.nextLine();
        }

        if (isEnaugh){
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",priceTotal );
        }else {
            System.out.printf("We need %.2f leva more.%n", requiredIncome - priceTotal);
            System.out.printf("Club income - %.2f leva.", priceTotal);
        }
    }
}
