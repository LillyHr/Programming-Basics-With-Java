package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1DebitpH = Integer.parseInt(scanner.nextLine());
        int pipe2DebitpH = Integer.parseInt(scanner.nextLine());
        double hoursGone = Double.parseDouble(scanner.nextLine());

        double pipe1Work = pipe1DebitpH * hoursGone;
        double pipe2Work = pipe2DebitpH * hoursGone;
        double sumPipeWork = pipe1Work + pipe2Work;
        double percent = (sumPipeWork / volume) * 100;
        double percent1Pipe = (pipe1Work / sumPipeWork) * 100;
        double percent2Pipe = (pipe2Work / sumPipeWork) * 100;
        double overFlow = sumPipeWork - volume;

        boolean fullness = volume >= sumPipeWork;
        if (fullness) {
            System.out.printf("The pool is %.2f", percent);
            System.out.print("%");
            System.out.printf(" full. Pipe 1: %.2f", percent1Pipe);
            System.out.print("%");
            System.out.printf(". Pipe 2: %.2f", percent2Pipe);
            System.out.print("%.");

        } else {

            System.out.printf("For %f hours the pool overflows with %.0f liters.", hoursGone, overFlow);
        }
    }
}
