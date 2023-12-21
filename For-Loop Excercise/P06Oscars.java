package ForLoopJavaExercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

            double graderPoints = points + 0;

        for (int i = 1; i <= n; i++) {
            String nameGrader = scanner.nextLine();
            double pointsGrader = Double.parseDouble(scanner.nextLine());
            double namePoints = (nameGrader.length() * pointsGrader)/2;
            graderPoints = graderPoints + namePoints;
            if (graderPoints >= 1250.5) {
                n =0;
            }
        }
        if (graderPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, graderPoints);
        } else {
            double diff = 1250.5 - graderPoints;
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        }
    }
}
