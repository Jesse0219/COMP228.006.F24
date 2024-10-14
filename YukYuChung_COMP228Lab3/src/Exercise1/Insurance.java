package Exercise1;

import java.util.Date;

public abstract class Insurance {
    private String typeOfInsurance;
    private String policyHolderName;
    private double monthlyCost;
    private Date startDate;
    private Date endDate;

    // Constructor
    public Insurance(String typeOfInsurance, String policyHolderName, double monthlyCost, Date startDate, Date endDate) {
        this.typeOfInsurance = typeOfInsurance;
        this.policyHolderName = policyHolderName;
        this.monthlyCost = monthlyCost;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // Abstract methods
    public abstract void setInsuranceCost(double monthlyCost);

    public abstract void displayInfo();

    // Display Policy method
    public void displayPolicy() {
        System.out.println("Insurance Type: " + typeOfInsurance);
        System.out.println("Policy Holder Name: " + policyHolderName);
        System.out.println("Monthly Cost: " + monthlyCost);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}