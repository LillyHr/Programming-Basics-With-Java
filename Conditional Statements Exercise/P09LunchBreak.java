package ConditionalStatementsExercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P09LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvSeries = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime * (1.0/8);
        double restTime = breakTime * (1.0/4);
        double time = breakTime - lunchTime - restTime;
        double realization = (time - duration);


        if (realization >= 0) {
            realization = Math.ceil(Math.abs(realization));
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvSeries, realization);
        } else {
            realization = Math.ceil(Math.abs(realization));
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvSeries, realization);
        }
    }
}
