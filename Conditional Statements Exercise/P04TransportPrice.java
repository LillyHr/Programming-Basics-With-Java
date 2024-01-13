package ConditionalStatementsMoreExercises;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        /* Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
        •	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        •	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        •	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и
        изчислява цената на най-евтиния транспорт.
         */
        double price = 0;

        if (km < 20) {
            if (dayTime.equals("day")) {
                price = 0.70 + (km * 0.79);
            } else {
                price = 0.70 + (km * 0.90);
            }
        } else if (km < 100) {
            price = 0.09 * km;
        } else {
            price = 0.06 * km;
        }
        System.out.printf("%.2f", price);
    }
}
