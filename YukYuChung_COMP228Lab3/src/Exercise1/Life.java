package Exercise1;

import java.util.Date;

public class Life extends Insurance {
    private int age;

    public Life(String typeOfInsurance, String policyHolderName, double monthlyCost, Date startDate, Date endDate, int age) {
        super(typeOfInsurance, policyHolderName, monthlyCost, startDate, endDate);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setInsuranceCost(double monthlyCost) {
        setMonthlyCost(monthlyCost);
    }

    @Override
    public void displayInfo() {
        super.displayPolicy();
        System.out.println("Age: " + age);
    }
}