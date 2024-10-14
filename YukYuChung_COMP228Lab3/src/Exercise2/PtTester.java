package Exercise2;

public class PtTester extends GameTester {
    private double workingHours;

    public PtTester(String testerType, String staffName, String staffEmail, String staffPhone) {
        super(testerType, staffName, staffEmail, staffPhone);
    }

    // Getter and Setter
    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void setTotalSalary(double salary) {
        setSalary(workingHours * 20);
    }

    @Override
    public void displayInfo() {
        displayCommonInfo();
    }
}