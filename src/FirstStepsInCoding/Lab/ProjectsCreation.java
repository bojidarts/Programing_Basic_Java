package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameArchitect = scanner.nextLine();
        int numProjects = Integer.parseInt(scanner.nextLine());
        int hours = numProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameArchitect, hours, numProjects);
    }
}
