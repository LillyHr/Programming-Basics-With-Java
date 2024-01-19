package ConditionalStatementsExercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P08Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        /* Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
        Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
           · Видеокарта – 250 лв./бр.
           · Процесор – 35% от цената на закупените видеокарти/бр.
           · Рам памет – 10% от цената на закупените видеокарти/бр.
           Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне. */
        double priceWithDiscount = 0;
        double priceVideoCards = videoCards * 250.0;
        double priceProcessors = processors* (priceVideoCards * 0.35);
        double priceRam = ramMemory*(priceVideoCards * 0.10);
        double price = priceProcessors + priceRam + priceVideoCards;
        if (videoCards > processors) {
            priceWithDiscount = price - (price * 0.15);
        } else {
            priceWithDiscount = price;
        }
        double endResult = budget - priceWithDiscount;
        if (endResult >= 0) {
            System.out.printf("You have %.2f leva left!", endResult);
        } else {
            endResult = Math.abs(endResult);
            System.out.printf("Not enough money! You need %.2f leva more!", endResult);
        }
    }
}
