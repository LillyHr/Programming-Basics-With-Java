package ConditionalStatementsExercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus = minutes + 15;
        if (minutesPlus >= 60 && hour <= 23) {
            hour = hour + 1;
            minutesPlus = minutesPlus - 60;
            if (minutesPlus < 10 && hour <= 23) {
                System.out.printf("%d:0%d", hour, minutesPlus);
            } else if (minutesPlus < 10 ) {
                hour = hour - 24;
                System.out.printf("%d:0%d", hour, minutesPlus);

            } else if (minutesPlus > 10 && hour >= 23) {
                hour = hour - 24;
                if (hour < 10) {
                    System.out.printf("%d:%d", hour, minutesPlus);
                } else {
                    System.out.printf("%d:%d", hour, minutesPlus);
                }

            } else if (minutesPlus >= 10 && hour < 23) {
                if (hour < 10) {
                    System.out.printf("%d:%d", hour, minutesPlus);
                } else {
                    System.out.printf("%d:%d", hour, minutesPlus);
                }

            }

        } else if (minutesPlus < 60 && hour <=23) {
            if (minutesPlus <10) {
                System.out.printf("%d:0%d", hour,minutesPlus);
            } else {
                System.out.printf("%d:%d", hour,minutesPlus);
            }
        }
    }
}
