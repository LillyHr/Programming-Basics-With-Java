package Lesson9;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String pass = scanner.next();
        String confirmPass = scanner.next();
        while (!pass.equals(confirmPass)) {
            confirmPass = scanner.next();
        }
        System.out.printf("Welcome %s!", username);
    }
}
