package ConditionalStatementsExercise;

import java.util.Scanner;

public class P05ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* · Пъзел - 2.60 лв.
        · Говореща кукла - 3 лв.
        · Плюшено мече - 4.10 лв.
        · Миньон - 8.20 лв.
        · Камионче - 2 лв.
        ако са 50 бр или повече, отстъпка 25%
        10% за наем от цялата печалба
         */
        double tripCost = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numberItems = puzzle + dolls + bears + minions + trucks;
        double sum = (puzzle * 2.60) + (dolls * 3.0) + (bears * 4.10) + (minions * 8.20) + (trucks * 2.0);
        double rentSum = 0;
        double discount = 0;
        double tripExpence = 0;

        if (numberItems >= 50) {
            discount = sum * 0.25;
            rentSum = (sum - discount) * 0.1;
            tripExpence = ((sum-discount)-rentSum) - tripCost;
            if (tripExpence >=0) {
                System.out.printf("Yes! %.2f lv left.", tripExpence);
            } else {
                tripExpence = Math.abs(tripExpence);
                System.out.printf("Not enough money! %.2f lv needed.", tripExpence);
            }

        } else {
            rentSum = sum * 0.1;
            tripExpence = (sum - rentSum) - tripCost;
            if (tripExpence >= 0) {
                System.out.printf("Yes! %.2f lv left.", tripExpence);
            } else {
                tripExpence = Math.abs(tripExpence);
                System.out.printf("Not enough money! %.2f lv needed.", tripExpence);
            }

        }

    }
}
