package ConditionalStatmentsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;

        switch (fruit){
            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 2.50 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 2.70 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 1.20 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 1.25 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 0.85 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 0.90 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 1.45 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 1.60 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 2.70 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 3.00 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 5.50 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 5.60 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
                    price = 3.85 * quantity;
                    System.out.printf("%.2f", price);
                }else if (day.equals("Saturday") || day.equals("Sunday")){
                    price = 4.20 * quantity;
                    System.out.printf("%.2f", price);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
