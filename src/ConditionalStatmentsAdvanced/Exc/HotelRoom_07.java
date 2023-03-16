package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0.00;
        double priceStudio = 0.00;

        switch (month){
            case "May":
            case "October":
                priceApartment = nights * 65;
                priceStudio = nights * 50;
                if (nights > 7 && nights <= 14 ){
                    priceStudio = priceStudio - priceStudio * 0.05;
                }else if (nights > 14){
                    priceStudio = priceStudio - priceStudio * 0.30;
                    priceApartment = priceApartment - priceApartment * 0.10;
                }
                break;
            case "June":
            case "September":
                priceApartment = nights * 68.70;
                priceStudio = nights * 75.20;
                if (nights > 14){
                    priceStudio = priceStudio - priceStudio * 0.20;
                    priceApartment = priceApartment - priceApartment * 0.10;
                }
                break;
            case "July":
            case "August":
                priceApartment = nights * 77;
                priceStudio = nights * 76;
                if (nights > 14){
                    priceApartment = priceApartment - priceApartment * 0.10;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
