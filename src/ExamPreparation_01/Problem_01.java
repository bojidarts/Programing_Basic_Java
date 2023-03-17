package ExamPreparation_01;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	Цена на една тенис ракета – реално число в интервала [0.00…100000.00]
        //•	Брой тенис ракети - цяло число в интервала [0…100]
        //•	Брой чифтове маратонки - цяло число в интервала [0…100]

        double priceTenisRacket = Double.parseDouble(scanner.nextLine());
        int countTenisRackets = Integer.parseInt(scanner.nextLine());
        int countTrainers = Integer.parseInt(scanner.nextLine());

        double priceAllRackets = priceTenisRacket * countTenisRackets;
        double priceOneTrainer = priceTenisRacket / 6;
        double priceAllTrainers = priceOneTrainer * countTrainers;
        double totalRacketsAndTrainers = priceAllTrainers + priceAllRackets;
        double priceOtherEquipment = totalRacketsAndTrainers * 0.20;
        double totalPrice = totalRacketsAndTrainers + priceOtherEquipment;
        double sumForDjokovic = totalPrice /8;
        double sumForSponsors =totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(sumForDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f%n", Math.ceil(sumForSponsors));

    }
}
