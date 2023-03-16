package ConditionalStatmentsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.next();

        if (age >= 16){
            switch (sex){
                case "m":
                    System.out.println("Mr.");
                    break;
                case "f":
                    System.out.println("Ms.");
                    break;
            }
        }else {
            switch (sex){
                case "m":
                    System.out.println("Master");
                    break;
                case "f":
                    System.out.println("Miss");
                    break;
            }
        }

    }
}
