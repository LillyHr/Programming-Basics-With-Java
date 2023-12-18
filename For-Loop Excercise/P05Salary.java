package ForLoopJavaExercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int fine = 0;
        int diff = 0;
        for (int i = 1; i <= n; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook" :
                    fine = fine + 150;
                    diff = salary - fine;
                    if (diff <= 0)
                    {
                       n = 0;
                    }
                    break;
                case "Instagram" :
                    fine = fine + 100;
                    diff = salary - fine;
                    if (diff <= 0)
                    {
                        n = 0;
                    }
                    break;
                case "Reddit" :
                    fine = fine + 50;
                    diff = salary - fine;
                    if (diff <= 0)
                    {
                        n = 0;
                    }
                    break ;
                default:
                    fine = fine + 0;

            }
        }
            diff = salary - fine;
        if (fine >= salary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(diff);
        }
    }
}
