package ConditionalStatementsLab;

import java.util.Scanner;

public class P03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int res = num % 2;
        if (res == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
