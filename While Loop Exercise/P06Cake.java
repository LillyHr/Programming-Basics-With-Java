package Lesson10;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int area = width * length;
        String command = "";
        while (area > 0) {
            command = scanner.nextLine();
            if (command.equals("STOP")) {
                break;
            }
            int pieces = Integer.parseInt(command);
            area -= pieces;

        }
        if (area <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
        } else {
            System.out.printf("%d pieces are left.", area);
        }
    }
}
