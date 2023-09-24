package Lesson12;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isPrime = true;
        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);
            if (num < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num / i != 0 && num % i != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                nonPrimeSum += num;
            } else {
                primeSum += num;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);

    }
}
