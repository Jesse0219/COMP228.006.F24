package Exercise3;

public abstract class  Mortgage implements MortgageConstants {
    //initialize variables
    private int mortgageNumber;
    private String customerName;
    private double amount;
    private double interestRate;
    private int term;
    //set max mortgage amount
    public Mortgage(int mortgageNumber, String customerName, double amount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (amount > max_mortgage_amount) {
            amount = max_mortgage_amount;
        }
        this.amount = amount;
        if (term != short_term && term != medium_term && term != long_term) {
            term =short_term;
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
    //get mortgage info method
    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nAmount: $" + amount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTerm: " + term + " years";
    }
}

