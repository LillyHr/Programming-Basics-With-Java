package Lesson9;

import java.util.Scanner;

public class P05AccauntBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double n = Double.parseDouble(input);
            if (n < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total = total + n;
            System.out.printf("Increase: %.2f%n", n);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", total);

    }
}
