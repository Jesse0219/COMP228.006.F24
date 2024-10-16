package Exercise3;

public abstract class  Mortgage implements MortgageConstants {
    private int mortgageNumber;
    private String customerName;
    private double amount;
    private double interestRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double amount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (amount > MAX_MORTGAGE_AMOUNT) {
            amount = MAX_MORTGAGE_AMOUNT;
        }
        this.amount = amount;
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            term = SHORT_TERM;
        }
        this.term = term;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public int getTerm() {
        return term;
    }

    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nAmount: $" + amount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTerm: " + term + " years";
    }
}

