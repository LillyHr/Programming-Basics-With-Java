package ConditionalStatementsExercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int athlete1 = Integer.parseInt(scanner.nextLine());
        int athlete2 = Integer.parseInt(scanner.nextLine());
        int athlete3 = Integer.parseInt(scanner.nextLine());

        int sum = athlete1 + athlete2 + athlete3;
        int minutes = sum / 60;
        double sec = sum % 60.0;
        if (sec < 10) {
            System.out.printf("%d:0%.0f", minutes, sec);
        } else {
            System.out.printf("%d:%.0f", minutes, sec);
        }
    }
}
