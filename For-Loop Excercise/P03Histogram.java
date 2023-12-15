package ForLoopJavaExercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum < 200) {
                p1 = p1 + 1;
            } else if (currentNum >= 200 && currentNum <= 399) {
                p2 = p2 + 1;
            } else if (currentNum >= 400 && currentNum <= 599) {
                p3 = p3 + 1;
            } else if (currentNum >= 600 && currentNum <= 799) {
                p4 = p4 + 1;
            } else {
                p5 = p5 + 1;
            }
        }
        double percentP1 = p1 / (n / 100.0);
        double percentP2 = p2 / (n / 100.0);
        double percentP3 = p3 / (n / 100.0);
        double percentP4 = p4 / (n / 100.0);
        double percentP5 = p5 / (n / 100.0);

        System.out.printf("%.2f", percentP1);
        System.out.println("%");
        System.out.printf("%.2f", percentP2);
        System.out.println("%");
        System.out.printf("%.2f", percentP3);
        System.out.println("%");
        System.out.printf("%.2f", percentP4);
        System.out.println("%");
        System.out.printf("%.2f", percentP5);
        System.out.println("%");
    }
}
