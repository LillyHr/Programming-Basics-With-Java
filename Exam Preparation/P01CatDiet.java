package Pre_Exam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatPercent = Integer.parseInt(scanner.nextLine());
        int proteinPercent = Integer.parseInt(scanner.nextLine());
        int carbPercent = Integer.parseInt(scanner.nextLine());
        int totalCal = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());
        double fat = (totalCal * fatPercent * 1.0 / 100) / 9;
        double protein = (totalCal * proteinPercent * 1.0 / 100) / 4;
        double carb = (totalCal * carbPercent * 1.0 / 100) / 4;
        double gramsOfFood = carb + protein + fat;
        double calPerGram = totalCal / gramsOfFood;
        double calWithoutWater = (calPerGram * (100 - waterPercent * 1.0))/100;
        System.out.printf("%.4f", calWithoutWater);
    }
}
