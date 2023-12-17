package ForLoopJavaExercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double costWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int birthdayMoney = 0;
        int toys = 0;

        for (int i =1; i <= age; i++) {
            if (i % 2 == 0) {
                int money = i * 5;
                birthdayMoney = birthdayMoney + money - 1;
            } else {
                toys = toys + 1;
            }
        }
        double costToys = toys * priceToy;
        double sum = costToys + birthdayMoney;
        double diff = sum - costWashingMachine;
        if (sum >= costWashingMachine) {

            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", Math.abs(diff));
        }
    }
}
