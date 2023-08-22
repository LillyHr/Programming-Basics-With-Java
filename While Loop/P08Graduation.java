package Lesson9;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sumGrades = 0;
        int i = 0;
        int exclude = 1;
        while (i < 12) {
            double grading = Double.parseDouble(scanner.nextLine());
            if (grading < 4) {
                exclude++;
                if (exclude > 2) {
                    i++;
                    System.out.printf("%s has been excluded at %d grade", name, i);
                    break;
                }
                continue;
            }
            i++;
            sumGrades += grading;
            if (i == 12) {
                double average = sumGrades / 12;
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
            }
        }


    }
}
