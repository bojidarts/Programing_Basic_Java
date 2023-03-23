package AdditionalExamTasks_01;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        boolean finished = false;
        double oneToPrint = Math.ceil(height * width * 4 * (100 - percent) / 100.0); // Calculate initial amount of paint
        String input = scanner.nextLine();

        while (!input.equals("Tired!")){
            int minusLiters = Integer.parseInt(input);
            oneToPrint -= minusLiters;

            if (oneToPrint < 0){ // Check if all walls are painted
                finished = true;
                break;
            }
            if (oneToPrint == 0){
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            }

            input = scanner.nextLine();
        }
        if (finished){
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(oneToPrint));
        }else {
            System.out.printf("%.0f quadratic m left.", oneToPrint);
        }
    }
}
