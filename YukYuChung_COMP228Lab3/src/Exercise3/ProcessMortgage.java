package Exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        //create an array of 3 mortgages.
        Mortgage[] mortgages = new Mortgage[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current interest rate: ");
        double primeRate = scanner.nextDouble();
        //add mortgages to the array with user input
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter mortgage type (1 for Business, 2 for Personal, 3 to finish): ");
            int type = scanner.nextInt();
            if (type == 3) {
                break;
            }
            System.out.print("Enter mortgage number: ");
            int mortgageNumber = scanner.nextInt();
            System.out.print("Enter customer name: ");
            String customerName = scanner.next();
            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter mortgage term (1 for short, 2 for medium, 3 for long): ");
            int term = scanner.nextInt();

            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, term, primeRate);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, term, primeRate);
            }
        }
        // print out the result for each mortgage
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                System.out.println(mortgage.getMortgageInfo());
                System.out.println("Total Amount Owed: $" + mortgage.getAmount() * (1 + mortgage.getInterestRate() / 100));
                System.out.println();
            }
        }
    }

}

