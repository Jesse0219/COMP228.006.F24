package Exercise2;

public abstract class GameTester {
    private String testerType;
    private String staffName;
    private String staffEmail;
    private String staffPhone;
    private double salary;

    // Constructor
    public GameTester(String testerType, String staffName, String staffEmail, String staffPhone) {
        this.testerType = testerType;
        this.staffName = staffName;
        this.staffEmail = staffEmail;
        this.staffPhone = staffPhone;
    }

    // Getter and Setter
    public String getTesterType() {
        return testerType;
    }

    public void setTesterType(String testerType) {
        this.testerType = testerType;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Abstract methods
    public abstract void setTotalSalary(double salary);

    public abstract void displayInfo();

    // Display Info
    public void displayCommonInfo() {
        System.out.println("Tester Type: " + testerType);
        System.out.println("Name: " + staffName);
        System.out.println("Email: " + staffEmail);
        System.out.println("Phone: " + staffPhone);
        System.out.println("Salary: " + salary);
    }
}