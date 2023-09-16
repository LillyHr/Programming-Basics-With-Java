package Lesson11;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;
        for (int i = n; i <= m; i++) {
            for (int j = n; j <= m; j++) {
                count++;
                if (j + i == x) {
                    sum = x;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, x);
                    break;
                }
            }
            if (sum == x) {
                break;
            }
        }
        if (sum != x) {
            System.out.printf("%d combinations - neither equals %d%n", count, x);
        }
    }
}
