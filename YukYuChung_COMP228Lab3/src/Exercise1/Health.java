package Exercise1;

import java.util.Date;

public class Health extends Insurance {
    private String healthStatus;

    public Health(String typeOfInsurance, String policyHolderName, double monthlyCost, Date startDate, Date endDate, String healthStatus) {
        super(typeOfInsurance, policyHolderName, monthlyCost, startDate, endDate);
        this.healthStatus = healthStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public void setInsuranceCost(double monthlyCost) {
        setMonthlyCost(monthlyCost);
    }

    @Override
    public void displayInfo() {
        super.displayPolicy();
        System.out.println("Health Status: " + healthStatus);
    }
}