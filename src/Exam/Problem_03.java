package Exam;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// 1.	Брой танцьори – цяло число в интервала [1 … 10]
//2.	Брой точки – реално число в интервала [1.00 … 10000.00]
//3.	Сезон –  текст със следните възможности - "summer" или "winter"
//4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double wonMoney = 0;
        switch (place){
            case "Bulgaria":
                wonMoney = points * dancers;
                if (season.equals("summer")){
                    wonMoney = wonMoney - wonMoney * 0.05;
                }else if (season.equals("winter")){
                    wonMoney = wonMoney - wonMoney * 0.08;
                }
                break;
            case "Abroad":
                wonMoney = (points * dancers) + ((points * dancers) * 0.50);
                if (season.equals("summer")){
                    wonMoney = wonMoney - wonMoney * 0.10;
                }else if (season.equals("winter")){
                    wonMoney = wonMoney - wonMoney * 0.15;
                }
                break;
        }

        double amountCharity = wonMoney * 0.75;
        double leftMoney = wonMoney - amountCharity;
        double sumForDancer = leftMoney / dancers;

        System.out.printf("Charity - %.2f%n", Math.abs(amountCharity));
        System.out.printf("Money per dancer - %.2f", Math.abs(sumForDancer));

    }
}
