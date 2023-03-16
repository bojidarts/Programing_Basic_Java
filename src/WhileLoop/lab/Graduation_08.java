package WhileLoop.lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int goodGradesCount = 1;
        double allGradeSum = 0;
        int poorGradesCount = 0;
        int gradeCount = 1;
        boolean isFailed = false;

        while (goodGradesCount <= 12){
            if (poorGradesCount == 2){
                isFailed = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4){
                poorGradesCount++;
                continue;
            }
            gradeCount++;
            goodGradesCount++;
            allGradeSum += grade;
        }
        double avgGrade = allGradeSum / 12;
        if (isFailed){
            System.out.printf("%s has been excluded at %d grade", student, gradeCount);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", student, avgGrade);
        }

    }
}
