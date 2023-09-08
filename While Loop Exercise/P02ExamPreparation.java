package Lesson10;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fails = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int count = 0;
        int sum = 0;
        String command = "";
        while (i < fails) {
            String problem = scanner.nextLine();
            if (problem.equals("Enough")) {
                double average = sum * 1.0 / count;
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s"
                        , average, count, command);
                break;
            }
            command = problem;
            int grade = Integer.parseInt(scanner.nextLine());
            sum += grade;
            count ++;
            if (grade <= 4) {
                i++;

            }

        }
        if (i == fails) {
            System.out.printf("You need a break, %d poor grades.", i);
        }

    }
}
