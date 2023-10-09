package Pre_Exam;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        if (season.equals("spring")) {
            if (people <= 5) {
                price = 50.00 * people;
            } else {
                price = 48.00 * people;
            }
        } else if (season.equals("summer")) {
            if (people <= 5) {
                price = 48.50 * people * 0.85;
            } else {
                price = 45.00 * people * 0.85;
            }
        } else if (season.equals("autumn")) {
            if (people <= 5) {
                price = 60.00 * people;
            } else {
                price = 49.50 * people;
            }
        } else if (season.equals("winter")) {
            if (people <= 5) {
                price = 86.00 * people + (86 * people * 0.08);
            } else {
                price = 85.00 * people + (85 * people * 0.08);
            }
        }
        System.out.printf("%.2f leva.", price);

    }
}
