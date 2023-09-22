package Lesson12;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isValid = false;
        for(int rows = 1; rows <= n; rows ++) {
            for (int coll = 1; coll <= rows ; coll ++) {
                if (currentNum > n) {
                    isValid = true;
                    break;
                }
                System.out.print(currentNum + " ");
                currentNum++;
            }
            if (isValid) {
                break;
            }
            System.out.println();
        }
    }
}
