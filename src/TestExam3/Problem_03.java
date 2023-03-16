package TestExam3;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numOfSets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")){
                price = 2 * 56;
                }else if (size.equals("big")){
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    price = 2 * 36.66;
                }else if (size.equals("big")){
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    price = 2 * 42.10;
                }else if (size.equals("big")){
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    price = 2 * 20;
                }else if (size.equals("big")){
                    price = 5 * 15.20;
                }
                break;
        }
                double totalPrice = price * numOfSets;
        if (totalPrice >= 400 && totalPrice <= 1000){
            totalPrice = totalPrice - totalPrice * 0.15;
        }else if (totalPrice > 1000){
            totalPrice = totalPrice - totalPrice * 0.50;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
