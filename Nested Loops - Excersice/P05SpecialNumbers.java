package Lesson12;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNum = "" + i;
            boolean isValid = true;
            for (int j = 0; j < currentNum.length(); j++) {
                int digit = Integer.parseInt("" + currentNum.charAt(j));
                if (digit == 0) {
                    isValid = false;
                    break;
                }
                if (n % digit != 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.print(i+" ");
            }
        }

    }
}
