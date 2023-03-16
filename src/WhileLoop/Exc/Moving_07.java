package WhileLoop.Exc;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        int totalCubicMeters = width * length * high;

        while (totalCubicMeters >= 0){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }
            int currentCubic = Integer.parseInt(input);
            totalCubicMeters -= currentCubic;
        }
        if (totalCubicMeters >= 0){
            System.out.printf("%d Cubic meters left.", totalCubicMeters);
        }
        else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalCubicMeters));
        }
    }
}
