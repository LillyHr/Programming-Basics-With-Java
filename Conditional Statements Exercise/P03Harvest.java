package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xSquareM = Integer.parseInt(scanner.nextLine());
        double yGrapesSqM = Double.parseDouble(scanner.nextLine());
        int zNeededLitWine = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        double wineLand = xSquareM * yGrapesSqM;
        double wine = (0.4 * wineLand)/ 2.5;

        if (wine >= zNeededLitWine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
            double wineLeft = Math.ceil(wine - zNeededLitWine);
            double winePerPerson = Math.ceil(wineLeft / workersCount);
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineLeft, winePerPerson);
        } else {
            double neededWine = Math.floor(zNeededLitWine - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", neededWine);
        }
    }
}
