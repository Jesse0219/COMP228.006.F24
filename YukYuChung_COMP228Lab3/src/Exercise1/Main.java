package Exercise1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        List<Insurance> insuranceList = new ArrayList<>();
        boolean addMore = true;
        while (addMore) {
            System.out.print("Enter the type of Insurance (Life or Health): ");
            String typeOfInsurance = scanner.nextLine().trim().toLowerCase();

            System.out.print("Enter the policy holder name: ");
            String policyHolderName = scanner.nextLine().trim();

            System.out.print("Enter the insurance start date (yyyy-mm-dd): ");
            Date startDate = null;
            try {
                startDate = dateFormat.parse(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid date format.");
                System.exit(0);
            }

            System.out.print("Enter the insurance end date (yyyy-mm-dd): ");
            Date endDate = null;
            try {
                endDate = dateFormat.parse(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid date format.");
                System.exit(0);
            }

            System.out.print("Enter the monthly premium amount: ");
            double monthlyCost = scanner.nextDouble();
            scanner.nextLine();  // Consume the leftover newline

            Insurance insurance = null;

            if (typeOfInsurance.equals("life")) {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume the leftover newline

                insurance = new Life("Life", policyHolderName, monthlyCost, startDate, endDate, age);

            } else if (typeOfInsurance.equals("health")) {
                System.out.print("Enter your health status: ");
                String healthStatus = scanner.nextLine().trim();

                insurance = new Health("Health", policyHolderName, monthlyCost, startDate, endDate, healthStatus);

            } else {
                System.out.println("Invalid insurance type");
                System.exit(0);
            }

            insurance.setInsuranceCost(monthlyCost);
            insuranceList.add(insurance);

            System.out.print("Do you want to add another insurance policy? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                addMore = false;
            }
        }

        System.out.println("\nInsurance Details:");
        for (Insurance insurance : insuranceList) {
            insurance.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}