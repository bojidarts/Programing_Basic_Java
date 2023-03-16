package ConditionalStatments.Exc;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1.	Име на сериал – текст
        //2.	Продължителност на епизод  – цяло число в диапазона [10… 90]
        //3.	Продължителност на почивката  – цяло число в диапазона [10… 120]
        String serial = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakDuration / 8.00;
        double timeForRest = breakDuration / 4.00;
        double timeLeft = breakDuration - (timeForLunch + timeForRest);
        if (timeLeft >= episodeDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(timeLeft - episodeDuration));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(episodeDuration - timeLeft));
        }


    }
}
