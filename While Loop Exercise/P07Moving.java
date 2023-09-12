package Lesson10;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        String command = "";
        int volume = width * depth * length;
        while (volume > 0) {
            command = scanner.nextLine();
            if (command.equals("Done")) {
                break;
            }
            int cubes = Integer.parseInt(command);
            volume -= cubes;
        }
        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }
    }
}
