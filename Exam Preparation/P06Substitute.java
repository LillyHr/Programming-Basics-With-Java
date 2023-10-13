package Pre_Exam;

import java.util.Scanner;

public class P06Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int h = m; h <= 8; h++) {
                    for (int g = 9; g >= n; g--) {
                        if (i % 2 == 0 && h % 2 == 0) {
                            if (j % 2 != 0 && g % 2 != 0) {
                                if (i != h || j != g) {
                                    count++;
                                    if (count <= 6) {
                                        System.out.printf("%d%d - %d%d%n", i, j, h, g);
                                    } else {
                                        break;
                                    }
                                } else {
                                    System.out.println("Cannot change the same player.");
                                }
                            }
                        }

                    }
                    if (count >= 6) {
                        break;
                    }
                }
                if (count >= 6) {
                    break;
                }
            }
            if (count >= 6) {
                break;
            }
        }
    }

}

