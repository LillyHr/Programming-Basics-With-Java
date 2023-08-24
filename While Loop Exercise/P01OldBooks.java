package Lesson10;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        String input = scanner.nextLine();
        int i = 0;
        while (!search.equals(input)) {

            if (input.equals("No More Books")) {
                break;
            }
            i++;
            input = scanner.nextLine();


        }
        if (search.equals(input)){
            System.out.printf("You checked %d books and found it.",i);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", i);
        }


    }
}
