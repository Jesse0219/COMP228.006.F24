package Exercise3;

public class BusinessMortgage extends Mortgage {
        // BusinessMortgage constructor
        public BusinessMortgage(int mortgageNumber, String customerName, double amount, int term, double primeRate) {
            super(mortgageNumber, customerName, amount, term);
            setInterestRate(primeRate + 1);
        }

}
