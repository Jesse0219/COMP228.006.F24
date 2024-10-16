import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Insurance[] insurances = new Insurance[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < insurances.length; i++) {
            System.out.println("Enter the type of insurance (Health or Life):");
            String type = scanner.nextLine();
            System.out.println("Enter the monthly cost:");
            double cost = scanner.nextDouble();
            scanner.nextLine();
            if (type.equalsIgnoreCase("Health")) {
                insurances[i] = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insurances[i] = new Life();
            }
            insurances[i].setInsuranceCost(cost);
        }
        for (Insurance insurance : insurances) {
            insurance.displayInfo();
        }
    }
}}
