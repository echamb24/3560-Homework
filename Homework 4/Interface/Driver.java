import java.util.ArrayList;

public class Driver {
    
    public static void main(String[] args) {
        ArrayList<Payable> toPay = new ArrayList<>();
        
        toPay.add(new Freelancer("Jeffery", "Bozes", 1000.1, 20)); 
        toPay.add(new VendorInvoice("Stove Jeebs", "1234", 500));
        toPay.add(new Freelancer("Elun", "Mosk", 18.5, 48)); 
        toPay.add(new VendorInvoice("Someone Else", "4321", 93));

        double sum = 0.0;
        for (Payable p : toPay){
            p.print();
            sum += p.calculatePayment();
        }

        System.out.println("Total Payout: " + sum);

    }
    
}
