package Lesson10;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int step = 0;
        String command = "0";
        while (sum < 10000) {
            command = scanner.nextLine();
            if (command.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                sum += stepsToHome;
                break;
            }
            step = Integer.parseInt(command);
            sum += step;
        }
        if (sum < 10000) {
            int diff = Math.abs(10000 - sum);
            System.out.printf("%d more steps to reach goal.", diff);
        } else {
            int diff = Math.abs(10000 - sum);
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
        }


    }
}
