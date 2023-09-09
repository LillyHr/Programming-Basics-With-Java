package Lesson10;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacayMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double sumMoney = 0;
        int count = 0;
        int days = 0;
        while (availableMoney < vacayMoney) {
            if (count == 5) {
                break;
            }
            String money = scanner.nextLine();
            double usedMoney = Double.parseDouble(scanner.nextLine());
            days++;
            if (money.equals("spend")) {
                count++;
                availableMoney -= usedMoney;
            } else if (money.equals("save")) {
                availableMoney += usedMoney;
                count = 0;
            }
            if (availableMoney < 0) {
                availableMoney = 0;
            }
        }
        if (count == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
