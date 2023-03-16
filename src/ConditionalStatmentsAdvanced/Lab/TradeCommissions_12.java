package ConditionalStatmentsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double quantitySells = Double.parseDouble(scanner.nextLine());
        double commission = 0.00;

        switch (city){
            case "Sofia":
                if (quantitySells >= 0 && quantitySells <= 500){
                    commission = quantitySells * 0.05;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 500 && quantitySells <= 1000){
                    commission = quantitySells * 0.07;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 1000 && quantitySells <= 10000){
                    commission = quantitySells * 0.08;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 10000){
                    commission = quantitySells * 0.12;
                    System.out.printf("%.2f", commission);
                }else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (quantitySells >= 0 && quantitySells <= 500){
                    commission = quantitySells * 0.045;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 500 && quantitySells <= 1000){
                    commission = quantitySells * 0.075;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 1000 && quantitySells <= 10000){
                    commission = quantitySells * 0.10;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 10000){
                    commission = quantitySells * 0.13;
                    System.out.printf("%.2f", commission);
                }else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (quantitySells >= 0 && quantitySells <= 500){
                    commission = quantitySells * 0.055;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 500 && quantitySells <= 1000){
                    commission = quantitySells * 0.08;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 1000 && quantitySells <= 10000){
                    commission = quantitySells * 0.12;
                    System.out.printf("%.2f", commission);
                }else if (quantitySells > 10000){
                    commission = quantitySells * 0.145;
                    System.out.printf("%.2f", commission);
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
