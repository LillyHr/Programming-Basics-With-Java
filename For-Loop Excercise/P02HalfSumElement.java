package ForLoopJavaExercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

            if (maxNumber < currentNum) {
                maxNumber = currentNum;
            }
        }
        int sumMax = sum - maxNumber;
        if (sumMax == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumMax);
        } else {
            int diff = maxNumber - sumMax;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }
    }
}
