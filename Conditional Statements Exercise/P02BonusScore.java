package ConditionalStatementsExercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (price <= 100) {
            bonus = 5;
        } else if (price < 1000) {
            bonus = price * 0.2;
        } else if (price > 1000) {
            bonus = price * 0.10;
        }
        if (price % 2 == 0) {
            bonus = bonus + 1;
            System.out.println(bonus);
            System.out.println(price + bonus);
        } else if (price % 10 == 5) {
            bonus = bonus + 2;
            System.out.println(bonus);
            System.out.println(bonus + price);
        } else {
            System.out.println(bonus);
            System.out.println(bonus + price);
        }
    }
}
