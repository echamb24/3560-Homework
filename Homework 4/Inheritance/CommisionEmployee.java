public class CommisionEmployee extends Employee {

    private int comRate;
    private int grossSales;

    public CommisionEmployee(String firstName, String lastName, String ssn, int comRate, int grossSales){
        super(firstName, lastName, ssn);
        this.comRate = comRate;
        this.grossSales = grossSales;
    }

    public int getComRate() {
        return this.comRate;
    }

    public void setComRate(int comRate){
        this.comRate = comRate;
    }

    public int getGrossSales() {
        return this.grossSales;
    }

    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }

}