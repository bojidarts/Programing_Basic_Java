package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int viewers = rows * columns;
        double priceProjection = 0.00;
        switch (typeProjection) {
            case "Premiere":
                priceProjection = viewers * 12.00;
                break;
            case "Normal":
                priceProjection = viewers * 7.50;
                break;
            case "Discount":
                priceProjection = viewers * 5.00;
                break;
        }
        System.out.printf("%.2f leva", priceProjection);

    }
}
