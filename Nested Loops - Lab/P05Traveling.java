package Lesson11;

import java.util.Scanner;

public class P05Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String destination = command;
            double trip = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < trip) {
                double money = Double.parseDouble(scanner.nextLine());
                sum += money;
            }
            System.out.printf("Going to %s!%n", destination);
            command = scanner.nextLine();
        }
    }
}
