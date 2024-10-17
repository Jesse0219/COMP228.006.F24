package Exercise3;

public class PersonalMortgage extends Mortgage {
    //constructor for personal mortgage
    public PersonalMortgage(int mortgageNumber, String customerName, double amount, int term, double primeRate) {
        super(mortgageNumber, customerName, amount, term);
        setInterestRate(primeRate + 2);
    }
}
