package WhileLoop.Exc;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int madeSteps = 0;

        while (!input.equals("Going home")){

            int steps = Integer.parseInt(input);
            madeSteps += steps;
            if (madeSteps >= 10000){
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
             madeSteps += stepsToHome;
        }
        if (madeSteps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", madeSteps - 10000);
        }else {
            System.out.printf("%d more steps to reach goal.", 10000 - madeSteps);
        }
    }
}
