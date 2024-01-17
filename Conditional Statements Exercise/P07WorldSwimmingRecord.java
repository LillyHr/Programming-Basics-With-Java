package ConditionalStatementsExercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double distanceInSec1M = Double.parseDouble(scanner.nextLine());
        /* съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди. Когато се изчислява
        колко пъти Иван ще се забави, в резултат на съпротивлението на водата, резултатът трябва да
        се закръгли надолу до най-близкото цяло число.
        Да се изчисли времето в секунди, за което Иван ще преплува
        разстоянието и разликата спрямо Световния рекорд.
         */

        double score = distanceInMeter * distanceInSec1M;
        double resistance = (Math.floor(distanceInMeter / 15.0)) * 12.5;
        double totalTime = score + resistance;
        boolean worldRecord = totalTime < recordInSeconds;

        if (worldRecord == true) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            double difference = recordInSeconds - totalTime;
            difference = Math.abs(difference);
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }



    }

}
