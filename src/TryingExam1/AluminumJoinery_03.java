package TryingExam1;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String kindJoinery = scanner.nextLine();
        String wayOfDelivery = scanner.nextLine();
        double price = 0;

        switch (kindJoinery){
            case "90X130":
                price = countJoinery * 110;
                if (countJoinery > 30 && countJoinery < 60){
                    price = price - price * 0.05;
                }else if (countJoinery > 60){
                    price = price - price * 0.08;
                }
                break;
            case "100X150":
                price = countJoinery * 140;
                if (countJoinery > 40 && countJoinery < 80){
                    price = price - price * 0.06;
                }else if (countJoinery > 80){
                    price = price - price * 0.10;
                }
                break;
            case "130X180":
                price = countJoinery * 190;
                if (countJoinery > 20 && countJoinery < 50){
                    price = price - price * 0.07;
                }else if (countJoinery > 50){
                    price = price - price * 0.12;
                }
                break;
            case "200X300":
                price = countJoinery * 250;
                if (countJoinery > 25 && countJoinery < 50){
                    price = price - price * 0.09;
                }else if (countJoinery > 50){
                    price = price - price * 0.14;
                }
                break;
        }
        if (wayOfDelivery.equals("With delivery")){
            price = price + 60;
        }
        if (countJoinery > 99){
            price = price - price * 0.04;

        }

        if (countJoinery < 10){
            System.out.println("Invalid order");
        }else {
            System.out.printf("%.2f BGN", price);
        }
    }
}
