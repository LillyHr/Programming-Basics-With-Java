package ForLoopJavaExercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        int sumPeople = 0;

        for (int i = 1; i <= groups; i++) {

            int people = Integer.parseInt(scanner.nextLine());
            sumPeople = sumPeople + people;

            if (people <= 5) {
                g1 = g1 + people;
            } else if (people <= 12) {
                g2 = g2 + people;
            } else if (people <= 25) {
                g3 = g3 + people;
            } else if (people <= 40) {
                g4 = g4 + people;
            } else {
                g5 = g5 + people;
            }
        }
        double percent1 = g1 / (sumPeople / 100.0);
        double percent2 = g2 / (sumPeople / 100.0);
        double percent3 = g3 / (sumPeople / 100.0);
        double percent4 = g4 / (sumPeople / 100.0);
        double percent5 = g5 / (sumPeople / 100.0);

        System.out.printf("%.2f", percent1);
        System.out.println("%");
        System.out.printf("%.2f", percent2);
        System.out.println("%");
        System.out.printf("%.2f", percent3);
        System.out.println("%");
        System.out.printf("%.2f", percent4);
        System.out.println("%");
        System.out.printf("%.2f", percent5);
        System.out.println("%");
    }
}

