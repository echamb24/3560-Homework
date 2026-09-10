public class BaseEmployee extends Employee {

    private int baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, int baseSalary){
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

}