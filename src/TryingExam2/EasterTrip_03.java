package TryingExam2;

import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	Първи ред - дестинация - текст с възможности"France", "Italy" или "Germany"
        //•	Втори ред - дати, през които си е резервирала екскурзията - текст  с възможности "21-23",
        //"24-27" или "28-31"
        //•	Трети ред - брой нощувки - цяло число в интервала [1… 100]
        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (date){
            case "21-23":
                if (destination.equals("France")){
                    price = 30;
                }else if (destination.equals("Italy")){
                    price = 28;
                }else if (destination.equals("Germany")){
                    price = 32;
                }
                break;
            case "24-27":
                if (destination.equals("France")){
                    price = 35;
                }else if (destination.equals("Italy")){
                    price = 32;
                }else if (destination.equals("Germany")){
                    price = 37;
                }
                break;
            case "28-31":
                if (destination.equals("France")){
                    price = 40;
                }else if (destination.equals("Italy")){
                    price = 39;
                }else if (destination.equals("Germany")){
                    price = 43;
                }
                break;
        }
        double totalPrice = countNights * price;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
