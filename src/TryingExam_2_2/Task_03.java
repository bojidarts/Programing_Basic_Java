package TryingExam_2_2;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// •	Първи ред – размер на яйцата – текст с възможности "Large", "Medium" или "Small"
//•	Втори ред – цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
//•	Трети ред – брой партиди – цяло число в интервала [1… 350]
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (size){
            case "Large":
                if (color.equals("Red")){
                price = 16;
                }else if (color.equals("Green")){
                    price = 12;
                }else if (color.equals("Yellow")){
                    price = 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")){
                    price = 13;
                }else if (color.equals("Green")){
                    price = 9;
                }else if (color.equals("Yellow")){
                    price = 7;
                }
                break;
            case "Small":
                if (color.equals("Red")){
                    price = 9;
                }else if (color.equals("Green")){
                    price = 8;
                }else if (color.equals("Yellow")){
                    price = 5;
                }
                break;
        }
        double priceAll = price * number;
        double totalPrice = priceAll - priceAll * 0.35;
        System.out.printf("%.2f leva.", totalPrice);

    }
}
