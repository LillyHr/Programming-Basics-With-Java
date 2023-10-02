package Lesson12;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int count = 0;
        int totalCount = 0;
        int kids = 0;
        int students = 0;
        int standard = 0;
        int totalKids = 0;
        int totalStudent = 0;
        int totalStandard = 0;

        while (!command.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                String typeTicket = ticket;
                count++;
                switch (typeTicket) {
                    case "student":
                        students++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                if (count >= seats) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            totalCount += count;
            totalStandard += standard;
            totalKids += kids;
            totalStudent += students;
            double percentSeats = count * 1.0 / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", command, percentSeats);
            count = 0;
            kids = 0;
            students = 0;
            standard = 0;

            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalCount);
        double averageStudent = totalStudent * 1.0 / totalCount * 100;
        double averageStandard = totalStandard * 1.0 / totalCount * 100;
        double averageKids = totalKids * 1.0 / totalCount * 100;
        System.out.printf("%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.%n"
                , averageStudent, averageStandard, averageKids);
    }
}
