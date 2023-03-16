    package TryingExam2;

    import java.util.Scanner;

    public class EasterEggsBattle_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int countEggsPlayer1 = Integer.parseInt(scanner.nextLine());
            int countEggsPlayer2 = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();


            while (!input.equals("End")) {
                if (input.equals("one")) {
                    countEggsPlayer2 -= 1;
                } else if (input.equals("two")) {
                    countEggsPlayer1 -= 1;
                }

                if (countEggsPlayer1 <= 0) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", countEggsPlayer2);
                    break;
                } else if (countEggsPlayer2 <= 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countEggsPlayer1);
                    break;
                }

                input = scanner.nextLine();

            }
            if (countEggsPlayer1 > 0 && countEggsPlayer2 > 0) {
                System.out.printf("Player one has %d eggs left.%n", countEggsPlayer1);
                System.out.printf("Player two has %d eggs left.", countEggsPlayer2);
            }

        }
    }
