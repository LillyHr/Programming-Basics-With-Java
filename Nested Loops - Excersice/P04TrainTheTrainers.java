package Lesson12;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumGrade = 0;
        int count = 0;
        double totalAverage = 0;
        while (!input.equals("Finish")) {
            String presentation = input;
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;
            }
            double average = sumGrade / jury;
            System.out.printf("%s - %.2f.%n", presentation, average);
            count++;
            totalAverage += average;
            average = 0;
            sumGrade = 0;
            input = scanner.nextLine();
        }
        totalAverage = totalAverage / count;
        System.out.printf("Student's final assessment is %.2f.%n", totalAverage);
    }
}
