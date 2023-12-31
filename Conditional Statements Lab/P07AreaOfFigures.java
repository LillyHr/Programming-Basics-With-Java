package ConditionalStatementsLab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String geoForm = scanner.nextLine();

        if (geoForm.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            double squareArea = squareSide * squareSide;
            System.out.printf("%.3f", squareArea);
        } else if (geoForm.equals("rectangle")) {
            double rectangleA = Double.parseDouble(scanner.nextLine());
            double rectangleB = Double.parseDouble(scanner.nextLine());
            double rectangleArea = rectangleA * rectangleB;
            System.out.printf("%.3f", rectangleArea);
        } else if (geoForm.equals("circle")) {
            double circleR = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * (circleR * circleR);
            System.out.printf("%.3f", circleArea);
        } else {
            double triangleH = Double.parseDouble(scanner.nextLine());
            double triangleA = Double.parseDouble(scanner.nextLine());
            double triangleArea = 0.5 * triangleA * triangleH;
            System.out.printf("%.3f", triangleArea);
        }
    }
}
