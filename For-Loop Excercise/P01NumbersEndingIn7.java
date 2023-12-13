package ForLoopJavaExercise;

import java.util.Scanner;

public class P01NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i <= 1000; i = i + 10) {
            System.out.println(i);
        }
    }
}
