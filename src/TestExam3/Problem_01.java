package TestExam3;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rentSum = Double.parseDouble(scanner.nextLine());

        double priceCake = rentSum * 0.20;
        double priceDrinks = priceCake - priceCake * 0.45;
        double priceAnimator = rentSum / 3;
        double totalSum = rentSum + priceAnimator + priceCake + priceDrinks;
        System.out.println(totalSum);

    }
}
