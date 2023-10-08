package Pre_Exam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double deerOne = Double.parseDouble(scanner.nextLine());
        double deerTwo = Double.parseDouble(scanner.nextLine());
        double deerThree = Double.parseDouble(scanner.nextLine());
        double neededFood = deerOne * days * 1.0 + deerTwo * days * 1.0 + deerThree * days * 1.0;
        double diff = Math.abs(leftFood * 1.0 - neededFood);
        if (leftFood * 1.0 >= neededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }

    }
}
