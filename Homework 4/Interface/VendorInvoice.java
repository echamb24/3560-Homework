public class VendorInvoice implements Payable {
    
    private String name;
    private String invoiceNum;
    private double amountDue;

    public VendorInvoice(String name, String invoiceNum, double amountDue) {
        this.name = name;
        this.invoiceNum = invoiceNum;
        setAmountDue(amountDue);
    }

    //Setters and getters ------------------

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public double getAmountDue() {
        return this.amountDue;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue >= 0) {
            this.amountDue = amountDue;
        } else {
            System.out.println("ERROR: Amount Due is negative");
        }
    }


    public double calculatePayment(){
        return amountDue;
    }

    public String getPayeeName(){
        return name;
    }

    public void print(){
        System.out.println(getPayeeName() + " (" + invoiceNum + ") | " + calculatePayment());
    }

}
