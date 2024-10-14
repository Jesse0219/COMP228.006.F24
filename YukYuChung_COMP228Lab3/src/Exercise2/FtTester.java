package Exercise2;

public class FtTester extends GameTester {
    public FtTester(String testerType, String staffName, String staffEmail, String staffPhone) {
        super(testerType, staffName, staffEmail, staffPhone);
    }

    @Override
    public void setTotalSalary(double salary) {
        setSalary(3000);
    }

    @Override
    public void displayInfo() {
        displayCommonInfo();
    }
}


