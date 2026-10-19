import macronutrient.Customer;
import macronutrient.MacronutrientFactory;
import macronutrient.Meal;

public class MacroDriver {
    public static void main(String[] args) {
        
        Customer[] customers = {
            new Customer("Adam", "No Restriction"),
            new Customer("Bob", "Paleo"),
            new Customer("Charles", "Vegan"),
            new Customer("Doofenshmirtz", "Nut Allergy"),
            new Customer("Ethan", "Paleo"),
            new Customer("Frank", "Vegan")
        };

        MacronutrientFactory macFactory = MacronutrientFactory.getInstance();

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Diet Plan: " + customer.getDietPlan());
            
            Meal customerMeal = macFactory.createMeal(customer.getDietPlan());
            customerMeal.printMeal();
        }
    }
}