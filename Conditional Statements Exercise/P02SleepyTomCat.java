package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weekends = Integer.parseInt(scanner.nextLine());

        /* Котката Том обича по цял ден да спи, за негово съжаление стопанинът му си играе с него винаги
        когато  има свободно време. За да се наспи добре, нормата за игра на Том е 30 000  минути в година.
         Времето за игра на Том зависи от почивните дни на стопанина му:
        •	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        •	Когато почива, стопанинът му си играе с него  по 127 минути на ден.
         Напишете програма, която въвежда броя почивни дни и отпечатва дали Том може да се наспи добре
         и колко е разликата от нормата за текущата година, като приемем че годината има 365 дни.
         Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345). Реалното време за игра е 24 275 минути
         (345 * 63 + 20 *127).  Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.
*/
        int workDays = 365 - weekends;
        int playWeekends = 127 * weekends;
        int playWork = workDays * 63;
        int playTime = playWork + playWeekends;
        int playNorm = 30000 - playTime;
        int minutes = Math.abs(playNorm) / 60;
        int seconds = Math.abs(playNorm) % 60;
        if (playNorm >= 0) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", minutes, seconds);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", minutes, seconds);
        }
    }
}
