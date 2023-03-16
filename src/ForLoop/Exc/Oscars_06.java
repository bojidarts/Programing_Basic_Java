package ForLoop.Exc;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countMentors = Integer.parseInt(scanner.nextLine());
        double totalPoints = pointsFromAcademy;

        for (int i = 1; i <= countMentors; i++) {
            String nameMentor = scanner.nextLine();
            double pointsFromMentor = Double.parseDouble(scanner.nextLine());
            int lengthName = nameMentor.length();
            double pointsMentorsFinal = (lengthName * pointsFromMentor) / 2;
            totalPoints += pointsMentorsFinal;
            if (totalPoints > 1250.5){
                break;
            }
        }
        if (totalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - totalPoints);
        }

    }
}
