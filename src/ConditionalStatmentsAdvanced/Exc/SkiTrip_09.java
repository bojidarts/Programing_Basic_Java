package ConditionalStatmentsAdvanced.Exc;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();
        int nights = days - 1;
        double price = 0.00;

        switch (room){
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                price = nights * 25.00;
                if (days < 10){
                    price = price - price * 0.30;
                }else if (days > 10 && days <= 15){
                    price = price - price * 0.35;
                }else if (days > 15){
                    price = price - price * 0.50;
                }
                break;
            case "president apartment":
                price = nights * 35.00;
                if (days < 10){
                    price = price - price * 0.10;
                }else if (days > 10 && days <= 15){
                    price = price - price * 0.15;
                }else if (days > 15){
                    price = price - price * 0.20;
                }
                break;
        }
        if (mark.equals("positive")){
            price = price + price * 0.25;
        }else if (mark.equals("negative")){
            price = price - price * 0.10;
        }
        System.out.printf("%.2f", price);
    }
}
