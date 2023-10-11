package Pre_Exam;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerCount = Integer.parseInt(scanner.nextLine());
        double sales = 0;
        double sumRating = 0;
        double avgRating = 0;

        for (int i = 1; i <= computerCount; i++) {
            int possibleSalesAndRating = Integer.parseInt(scanner.nextLine());

            int rating = possibleSalesAndRating % 10;
            int possibleSales = possibleSalesAndRating / 10;

            if (rating == 2) {
                sales += 0;
                sumRating += rating;
            } else if (rating == 3) {
                sales += (possibleSales * 0.5);
                sumRating += rating;
            } else if (rating == 4) {
                sales += (possibleSales * 0.7);
                sumRating += rating;
            } else if (rating == 5) {
                sumRating += rating;
                sales += (possibleSales * 0.85);
            } else if (rating == 6) {
                sales += possibleSales;
                sumRating += rating;
            }

        }
        avgRating = sumRating/computerCount;
        System.out.printf("%.2f%n",sales);
        System.out.printf("%.2f%n", avgRating);
    }
}
