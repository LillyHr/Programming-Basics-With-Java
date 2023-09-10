package Lesson10;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        double num = Math.floor(amount * 100);
        int count = 0;
        while (num>0) {
            if (num >= 200) {
                count++;
                num = num - 200;
            } else if (num >= 100) {
                count++;
                num = num - 100;
            } else if (num >= 50) {
                count++;
                num = num - 50;
            } else if (num >= 20) {
                count++;
                num = num - 20;
            } else if (num >= 10) {
                count++;
                num = num - 10;
            } else if (num >= 5) {
                count++;
                num = num - 5;
            } else if (num >= 2) {
                count++;
                num = num - 2;
            } else if (num == 1) {
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
