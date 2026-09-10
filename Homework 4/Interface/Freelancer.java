public class Freelancer implements Payable{
    
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }


    //Setters and getters ------------------

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("ERROR: Hourly Rate is negative");
        }
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("ERROR: Hours Worked is negative");
        }
    }


    // Payment interface ---------

    public double calculatePayment(){
        if (hoursWorked <= 40) {
            return hourlyRate * hoursWorked;
        }
        return (hourlyRate * 40) + (hourlyRate * (hoursWorked - 40) * 1.5);
    }

    public String getPayeeName(){
        return firstName + " " + lastName;
    }


    // Print -----------

    public void print(){
        System.out.println(getPayeeName() + ": " + calculatePayment());
    }
}
