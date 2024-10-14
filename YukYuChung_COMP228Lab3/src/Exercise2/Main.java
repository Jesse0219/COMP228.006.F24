package Exercise2;

import Exercise1.Insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GameTester> testerList = new ArrayList<>();
        boolean addMore = true;

        while (addMore) {
            System.out.print("Enter the type of Game Tester (FullTime or PartTime): ");
            String testerType = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter the staff name: ");
            String staffName = scanner.nextLine().trim();

            System.out.print("Enter the staff email: ");
            String staffEmail = scanner.nextLine().trim();

            System.out.print("Enter the staff phone: ");
            String staffPhone = scanner.nextLine().trim();

            GameTester tester = null;

            if (testerType.equals("fulltime")) {
                tester = new FtTester("FullTime", staffName, staffEmail, staffPhone);
                tester.setTotalSalary(3000);
            } else if (testerType.equals("parttime")) {
                System.out.print("Enter the number of working hours: ");
                double workingHours = scanner.nextDouble();
                scanner.nextLine();  // Consume the leftover newline

                PtTester ptTester = new PtTester("PartTime", staffName, staffEmail, staffPhone);
                ptTester.setWorkingHours(workingHours);
                ptTester.setTotalSalary(workingHours * 20);
                tester = ptTester;
            } else {
                System.out.println("Invalid game tester type");
                continue;
            }

            testerList.add(tester);

            System.out.print("Do you want to add another game tester? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                addMore = false;
            }
        }

        System.out.println("\nGame Tester Details:");
        for (GameTester tester : testerList) {
            tester.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}