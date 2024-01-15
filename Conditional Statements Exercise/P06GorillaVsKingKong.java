package ConditionalStatementsExercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P06GorillaVsKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extra = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());

        /* · Декорът за филма е на стойност 10% от бюджета.
           · При повече от 150 статиста, има отстъпка за облеклото на стойност 10%. */

        double decor = budget * 0.1;
        double clothingDiscount = 0;
        double spendedMoney = 0;
        double endSum = 0;
        double extrasClothing = 0;

        if (extra > 150) {
            clothingDiscount = clothing * 0.1;
            extrasClothing = extra * (clothing - clothingDiscount);
            spendedMoney = decor + extrasClothing;
            endSum = budget - spendedMoney;
            if (endSum < 0) {
                endSum = Math.abs(endSum);
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", endSum);
            } else if (endSum >= 0) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", endSum);
            }

        } else {
            clothingDiscount = 0;
            extrasClothing = extra * clothing;
            spendedMoney = decor + extrasClothing;
            endSum = budget - spendedMoney;
            if (endSum < 0) {
                endSum = Math.abs(endSum);
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", endSum);
            } else if (endSum >= 0) {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", endSum);
            }
        }

    }
}
