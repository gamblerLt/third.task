package lt.code.academy;

public class Factory {

    private String factoryName;
    private int factoryCode;
    private  int employeesNumb;
    private double salary;

    public Factory(String factoryName, int factoryCode, int employeesNumb, double salary) {
        this.factoryName = factoryName;
        this.factoryCode = factoryCode;
        this.employeesNumb = employeesNumb;
        this.salary = salary;

    }

    public Factory(Factory uab_laivas) {
    }

    public String getFactoryName() {
        return factoryName;
    }

    public int getFactoryCode() {
        return factoryCode;
    }

    public int getEmployeesNumb() {
        return employeesNumb;
    }

    public double getSalary() {
        return salary;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setFactoryCode(int factoryCode) {
        this.factoryCode = factoryCode;
    }

    public void setEmployeesNumb(int employeesNumb) {
        this.employeesNumb = employeesNumb;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", factoryCode=" + factoryCode +
                ", employeesNumb=" + employeesNumb +
                ", salary=" + salary +
                '}';
    }
}
