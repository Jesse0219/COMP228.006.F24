public class Health extends Insurance {
    @Override
    public void setInsuranceCost(double cost) {
        super.setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + super.getInsuranceType());
        System.out.println("Monthly Cost: " + super.getMonthlyCost());
    }
}}
