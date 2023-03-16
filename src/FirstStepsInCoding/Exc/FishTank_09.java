package FirstStepsInCoding.Exc;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double capacityCentimeters = length * width * high;
        double capacityLiters = capacityCentimeters * 0.001;
        double neededWater = capacityLiters - capacityLiters * percent / 100;

        System.out.println(neededWater);



    }
}
